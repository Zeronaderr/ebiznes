package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class BrandController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getBrand(id: Long) = Action {
    var Brand = null // get Brand from db
    Ok(views.html.index("Brand for id = " + id))
  }

  def getBrands() = Action {
    var Brandsrepo = null // get all Brands
    Ok(views.html.index("All Brands list"))
  }

  def updateBrand(id: Long) = Action {
    var BrandForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Brand of id = " + id + " updated"))
  }

  def deleteBrand(id: Long) = Action {
    var BrandToDelete = null // get from db
    // delete Brand
    // Save
    Ok(views.html.index("Brand of id = " + id + " deleted"))
  }

  def addBrand() = Action {
    var BrandToAdd = null
    // add to db
    // save
    Ok(views.html.index("Brand added"))
  }
}
