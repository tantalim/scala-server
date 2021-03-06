package services

import java.io.File
import java.nio.file.{FileSystems, Files, StandardOpenOption}

import com.tantalim.artifacts.ArtifactService
import com.tantalim.artifacts.compiler.ModelCompiler
import com.tantalim.database.services.{DataReader, DataSaver}
import com.tantalim.nodes._
import com.tantalim.util.TantalimException
import controllers.core.PlayableDatabaseConnection
import play.api.libs.json._

class ArtifactExport(artifactType: String) extends DataReader with DataSaver with ModelCompiler with PlayableDatabaseConnection {
  val artifactReader = compileModel(artifactType)

  def readFromDatabaseAndWriteToSource(artifactName: String) = {
    val artifactInstance = getArtifactInstanceFromDatabase(artifactName)
    val jsObject = convertSmartNodeInstanceToJsObject(artifactInstance)
    writeToSource(artifactName, Json.prettyPrint(jsObject))
  }

  private def getArtifactInstanceFromDatabase(artifactName: String): SmartNodeInstance = {
    val artifact = queryModelData(artifactReader, filter = Some(s"name = '$artifactName'"))
    artifact.rows.headOption.getOrElse(throw new Exception("Failed to find exactly one row matching = " + artifactName))
  }

  private def writeToSource(artifactName: String, artifactContent: String) = {
    val fileLocation = getArtifactDirectory + "/" + artifactName + ".json"

    val artifactPath = FileSystems.getDefault.getPath(fileLocation)

    Files.write(artifactPath, artifactContent.getBytes(ArtifactService.charSet),
      StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)
  }

  private def getArtifactDirectory: String = {
    val moduleDirLocation = ArtifactService.tantalimRoot + "/src"
    if (!new File(moduleDirLocation).isDirectory) {
      throw new TantalimException(s"Source Directory does not exist: " + moduleDirLocation,
        "Create it in " + new File(moduleDirLocation).getAbsolutePath)
    }

    val artifactTypeLocation = moduleDirLocation + "/" + artifactType
    val artifactTypeFile = new File(artifactTypeLocation)
    if (!artifactTypeFile.exists()) {
      artifactTypeFile.mkdir()
    }

    artifactTypeLocation
  }

  private def convertSmartNodeInstanceToJsObject(instance: SmartNodeInstance): JsObject = {
    val model = instance.model
    val jsonFields = model.fields.values.map { field =>
      if (field.export) {
        val fieldValue = instance.get(field.name)
        val returnVal: (String, JsValue) = if (fieldValue.isDefined) {
          field.name -> (fieldValue.get match {
            case TntString(raw) =>
              if (raw == null || raw.trim.length == 0) JsNull
              else JsString(raw)
            case TntInt(raw) => JsNumber(raw.toInt)
            case TntDecimal(raw) => JsNumber(raw)
            case TntBoolean(raw) => JsBoolean(raw)
            case TntNull() => JsNull
            case value => JsString(value.toString)
          })
        } else {
          field.name -> JsNull
        }
        returnVal
      } else {
        field.name -> JsNull
      }
    }.toSeq.filter { case (fieldName, value) =>
      value != JsNull
    }

    val jsonChildren = model.children.map { case (childName, childModel) =>
      val childSet = instance.children.get(childName)
      val returnVal: (String, JsValue) = if (childSet.isEmpty) childName -> JsNull
      else childName -> {
        JsArray(childSet.get.rows.map { childRow =>
          convertSmartNodeInstanceToJsObject(childRow)
        })
      }
      returnVal
    }.toSeq.filter {
      case (_, value: JsArray) => value.value.nonEmpty
      case (_, _) => false
    }

    JsObject(jsonFields ++ jsonChildren)
  }
}
