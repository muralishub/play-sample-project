package com.murali.sample.controllers

import com.murali.sample.models.{Product, ProductForm}
import javax.inject._
import com.murali.sample.views.html._
import play.api.data.Form
import play.api.mvc._
import play.api.data.Forms._

@Singleton
class HomeController  @Inject()(cc: ControllerComponents) extends AbstractController(cc) {




   def postUrl = routes.HomeController.registerUser()


  def showHome = Action {implicit request =>

    Ok(index())
  }



  def registerUser = Action { implicit  request =>

   ProductForm.productForm.bindFromRequest.fold(
      formWithErrors => BadRequest,
     product =>  {
        product.name
        println(product.name)
        Ok("product OK!")
      })
  }
}



