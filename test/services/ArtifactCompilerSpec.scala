package services

import models.{ArtifactType, DeepTable}
import org.junit.runner._
import org.specs2.mock._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.libs.json.{JsValue, Json}

trait TableCacheMock extends TableCache {
  override def getTableFromCache(name: String): Option[DeepTable] = None

  override def addTableToCache(name: String, table: DeepTable): Unit = {}
}

@RunWith(classOf[JUnitRunner])
class ArtifactCompilerSpec extends Specification with Mockito {
  "ArtifactCompiler" should {
    "compile the Default menu" in {
      trait ArtifactServiceMock extends ArtifactService {
        override def getArtifactContentAndParseJson(artifactType: ArtifactType, name: String): JsValue =
          Json.parse( """
{
  "appTitle": "Test App",
  "content": []
}
                      """)
      }

      val compilerService = new ArtifactCompilerService with ArtifactServiceMock
      val menu = compilerService.compileMenu("Foo")
      menu.appTitle must be equalTo "Test App"
    }

    "compile the simple model" in {
      trait ArtifactServiceMock extends ArtifactService {
        override def getArtifactContentAndParseJson(artifactType: ArtifactType, name: String): JsValue = {
          artifactType match {
            case ArtifactType.Menu => Json.parse("{}")
            case ArtifactType.Page => Json.parse("{}")
            case ArtifactType.Table => Json.parse( """
{
  "dbName": "tbl_person",
  "columns": []
}
                                                   """)

            case ArtifactType.Model => Json.parse( """
{
  "basisTable": "Person",
  "fields": []
}
                                                   """)

          }
        }
      }

      val compilerService = new ArtifactCompilerService with ArtifactServiceMock with TableCacheMock
      val menu = compilerService.compileModel("ListPeople")
      menu.name must be equalTo "ListPeople"
    }
  }
}