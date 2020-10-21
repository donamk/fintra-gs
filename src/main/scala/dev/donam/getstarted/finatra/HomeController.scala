package dev.donam.getstarted.finatra

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

case class HiRequest(id: Long, name: String)

class HomeController extends Controller {
  get("/hi") { request: Request =>
    info("hi")
    "Hello " + request.params.getOrElse("name", "unnamed")
  }

  post("/hi") { hiRequest: HiRequest =>
    "Hello " + hiRequest.name + " with id " + hiRequest.id
  }
}
