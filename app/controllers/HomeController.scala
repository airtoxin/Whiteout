package controllers

import java.util.UUID
import javax.inject._
import play.api.mvc._
import whiteout.models.EpsilonGreedy

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    val eps = EpsilonGreedy(UUID.randomUUID, 0.5)
    println(eps)
    Ok(views.html.index("Your new application is ready."))
  }
}
