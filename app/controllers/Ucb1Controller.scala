package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{Action, Controller}

@Singleton
class Ucb1Controller @Inject() () extends Controller {
  def create() = Action { request =>
    Ok(s"Got request [${request.body.asJson}]")
  }
  def list() = Action { request =>
    Ok(s"Got request [${request.body.asJson}]")
  }
  def detail(id: String) = Action { request =>
    Ok(s"Got request [${request.body.asJson}] with id [$id]")
  }
  def update(id: String) = Action { request =>
    Ok(s"Got request [${request.body.asJson}] with id [$id]")
  }
  def delete(id: String) = Action { request =>
    Ok(s"Got request [${request.body.asJson}] with id [$id]")
  }
}
