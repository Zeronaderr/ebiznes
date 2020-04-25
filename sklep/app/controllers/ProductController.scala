package controllers

import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class ProductController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getProduct(id: Long) = Action {
    var product = null // get product from db
    Ok(views.html.index("Product for id = " + id))
  }

  def getProducts() = Action {
    var productsrepo = null // get all products
    Ok(views.html.index("All products list"))
  }

  def updateProduct(id: Long) = Action {
    var productForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Product of id = " + id + " updated"))
  }

  def deleteProduct(id: Long) = Action {
    var productToDelete = null // get from db
    // delete product
    // Save
    Ok(views.html.index("Product of id = " + id + " deleted"))
  }

  def addProduct() = Action {
    var productToAdd = null
    // add to db
    // save
    Ok(views.html.index("Product added"))
  }
}
