package com.murali.sample.controllers

import com.murali.sample.servers.ProductSource
import javax.inject._
import com.murali.sample.views.html._


import play.api.mvc._

@Singleton
class HomeController @Inject() (cc: ControllerComponents) extends AbstractController(cc){

  def showHome = Action {implicit request =>

    Ok(index())
  }








}



