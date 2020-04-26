package controllers

import javax.inject._
import models.{Employee, Address, AddressRepository, EmployeeRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

@Singleton
class EmployeeController @Inject()(employeesRepo: EmployeeRepository, addresses: AddressRepository,cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  val EmployeeForm: Form[CreateEmployeeForm] = Form {
    mapping(
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "addressId" -> number
    )(CreateEmployeeForm.apply)(CreateEmployeeForm.unapply)
  }

  val updateEmployeeForm: Form[UpdateEmployeeForm] = Form {
    mapping(
      "id" -> number,
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "addressId" -> number
    )(UpdateEmployeeForm.apply)(UpdateEmployeeForm.unapply)
  }

  def addEmployeeHandle = Action.async { implicit request =>
    var categ:Seq[Address] = Seq[Address]()
    val adrs = addresses.list().onComplete{
      case Success(cat) => categ = cat
      case Failure(_) => print("fail")
    }

    EmployeeForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.employeeadd(errorForm, categ))
        )
      },
      Employee => {
        employeesRepo.create(Employee.firstName, Employee.lastName, Employee.addressId).map { _ =>
          Redirect(routes.EmployeeController.addEmployee()).flashing("success" -> "Employee.created")
        }
      }
    )

  }

  def updateEmployeeHandle = Action.async { implicit request =>
    var adrs:Seq[Address] = Seq[Address]()
    val adrses = addresses.list().onComplete{
      case Success(a) => adrs = a
      case Failure(_) => print("fail")
    }

    updateEmployeeForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.employeeupdate(errorForm,adrs))
        )
      },
      employee => {
        employeesRepo.update(employee.id, Employee(employee.id, employee.firstName, employee.lastName, employee.addressId)).map { _ =>
          Redirect(routes.EmployeeController.updateEmployee(employee.id)).flashing("success" -> "Employee updated")
        }
      }
    )

  }

  def updateEmployee(id: Int) = Action.async { implicit request =>
    var EmployeeForUpdate = employeesRepo.getById(id) // get by id
    var cat:Seq[Address] = Seq[Address]()
    var adrs = addresses.list().onComplete{
      case Success(c) => cat = c
      case Failure(_) => print("fail")
    }
    EmployeeForUpdate.map(Employee => {
      val prodForm = updateEmployeeForm.fill(UpdateEmployeeForm(Employee.id,Employee.firstName,Employee.lastName,Employee.addressId))
      Ok(views.html.employeeupdate(prodForm,cat))
    })
    // update values
    // save
    //    Ok(views.html.index("Employee of id = " + id + " updated"))
  }

  def deleteEmployee(id: Int) = Action {implicit request =>
    employeesRepo.delete(id)
    Redirect("/api/employees")
  }

  def addEmployee() = Action.async { implicit request =>
    val adr = addresses.list()
    adr.map(c => Ok(views.html.employeeadd(EmployeeForm,c)))
    //    Ok(views.html.index("Employee added"))
  }

  //  REST API
  def getEmployeesApi = Action.async {implicit request =>
    val Employee = employeesRepo.list()
    Employee.map(p =>
      Ok(Json.toJson(p))
    )
  }
  def getEmployeeApi(id: Int) = Action.async {implicit request =>
    val Employee = employeesRepo.getByIdAsync(id)
    Employee.map(x => x match {
      case Some(p) => Ok(Json.toJson(p))
    })
  }
  def addEmployeeApi = Action { implicit request =>
    val req = request.body.asJson.get
    var Employee:Employee = req.as[Employee]
    employeesRepo.create(Employee.firstName,Employee.firstName,Employee.addressId)
    Ok(request.body.asJson.get)
  }

}
case class CreateEmployeeForm(firstName: String,lastName: String, addressId: Int)
case class UpdateEmployeeForm(id: Int, firstName: String,lastName: String, addressId: Int)
