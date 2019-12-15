package com.murali.sample.models


import play.api.data.Form
import play.api.mvc._
import play.api.data.Forms._

case class Product(name: String)

object ProductForm {

  val productForm = Form(
    mapping(
      "name" -> nonEmptyText
    )(Product.apply)(Product.unapply))



}

