package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}
import play.mvc.Action
import play.mvc.BodyParser.AnyContent

class EmployeeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def getEmployee(id: Long) = Action {
    var Employer = null // get Employer from db
    Ok(views.html.index("Employee for id = " + id))
  }

  def getEmployees() = Action {
    var Employersrepo = null // get all Employers
    Ok(views.html.index("All Employees list"))
  }

  def updateEmployee(id: Long) = Action {
    var EmployerForUpdate = null // get by id
    // update values
    // save
    Ok(views.html.index("Employee of id = " + id + " updated"))
  }

  def deleteEmployee(id: Long) = Action {
    var EmployerToDelete = null // get from db
    // delete Employer
    // Save
    Ok(views.html.index("Employee of id = " + id + " deleted"))
  }

  def addEmployee() = Action {
    var EmployerToAdd = null
    // add to db
    // save
    Ok(views.html.index("Employee added"))
  }
}
