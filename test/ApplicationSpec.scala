import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  "Application" should {

    "send 404 on a bad request" in new WithApplication {
      route(FakeRequest(GET, "/boum")) must beNone
    }

    "render the index page" in new WithApplication {
      val home = route(FakeRequest(GET, "/")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      contentAsString(home) must contain("List Tables")
    }

    "get data" in new WithApplication {
      val home = route(FakeRequest(GET, "/data/ListTables?filter=TableName%20Equals%20Table")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "application/json")
      // This keeps breaking so I'm not sure how much longer we should use it for testing
      contentAsString(home) must contain( """"TableTableID":1,""")
    }
  }
}