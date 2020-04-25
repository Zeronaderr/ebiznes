package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class ProductCategoryController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getProductCategory(id: Long) = Action {
    var productCategory = null // get product from db
    Ok(views.html.index("Product category for id = " + id))
  }

  def getProductCategories() = Action {
    var productCategoriesRepo = null // get all products
    Ok(views.html.index("All product categories list"))
  }

  def updateProductCategory(id: Long) = Action {
    var productCategoryForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("ProductCategory of id = " + id + " updated"))
  }

  def deleteProductCategory(id: Long) = Action {
    var productCategoryToDelete = null // get from db
    // delete product
    // Save
    Ok(views.html.index("Product Category of id = " + id + " deleted"))
  }

  def addProductCategory() = Action {
    var productToAdd = null
    // add to db
    // save
    Ok(views.html.index("Product Category added"))
  }
}
