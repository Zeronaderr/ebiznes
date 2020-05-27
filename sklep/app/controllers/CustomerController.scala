package controllers

import com.mohiva.play.silhouette.api.Silhouette
import javax.inject._
import models.{Address, AddressRepository, Customer, CustomerRepository}
import play.api.Environment
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc._
import utils.DefaultEnv

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

@Singleton
class CustomerController @Inject()(silhouette: Silhouette[DefaultEnv],customersRepo: CustomerRepository, addresses: AddressRepository,cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

//  val CustomerForm: Form[CreateCustomerForm] = Form {
//    mapping(
//      "firstName" -> nonEmptyText,
//      "lastName" -> nonEmptyText,
//      "addressId" -> number
//    )(CreateCustomerForm.apply)(CreateCustomerForm.unapply)
//  }
//
//  val updateCustomerForm: Form[UpdateCustomerForm] = Form {
//    mapping(
//      "id" -> number,
//      "firstName" -> nonEmptyText,
//      "lastName" -> nonEmptyText,
//      "addressId" -> number
//    )(UpdateCustomerForm.apply)(UpdateCustomerForm.unapply)
//  }

//  def addCustomerHandle = Action.async { implicit request =>
//    var categ:Seq[Address] = Seq[Address]()
//    val adrs = addresses.list().onComplete{
//      case Success(cat) => categ = cat
//      case Failure(_) => print("fail")
//    }
//
//    CustomerForm.bindFromRequest.fold(
//      errorForm => {
//        Future.successful(
//          BadRequest(views.html.customer.customeradd(errorForm, categ))
//        )
//      },
//      customer => {
//        customersRepo.create(customer.firstName, customer.lastName, customer.addressId).map { _ =>
//          Redirect(routes.CustomerController.addCustomer()).flashing("success" -> "Customer.created")
//        }
//      }
//    )
//
//  }

//  def updateCustomerHandle = Action.async { implicit request =>
//    var adrs:Seq[Address] = Seq[Address]()
//    val adrses = addresses.list().onComplete{
//      case Success(a) => adrs = a
//      case Failure(_) => print("fail")
//    }
//
//    updateCustomerForm.bindFromRequest.fold(
//      errorForm => {
//        Future.successful(
//          BadRequest(views.html.customer.customerupdate(errorForm,adrs))
//        )
//      },
//      customer => {
//        customersRepo.update(customer.id, Customer(customer.id, customer.firstName, customer.lastName, customer.addressId)).map { _ =>
//          Redirect(routes.CustomerController.updateCustomer(customer.id)).flashing("success" -> "Customer updated")
//        }
//      }
//    )
//
//  }
//
//  def updateCustomer(id: Int) = Action.async { implicit request =>
//    var CustomerForUpdate = customersRepo.getById(id) // get by id
//    var cat:Seq[Address] = Seq[Address]()
//    var adrs = addresses.list().onComplete{
//      case Success(c) => cat = c
//      case Failure(_) => print("fail")
//    }
//    CustomerForUpdate.map(customer => {
//      val prodForm = updateCustomerForm.fill(UpdateCustomerForm(customer.id,customer.firstName,customer.lastName,customer.addressId))
//      Ok(views.html.customer.customerupdate(prodForm,cat))
//    })
//    // update values
//    // save
//    //    Ok(views.html.index("Customer of id = " + id + " updated"))
//  }

//  def deleteCustomer(id: Int) = Action {implicit request =>
//    customersRepo.delete(id)
//    Redirect("/api/customers")
//  }
//
//  def addCustomer() = Action.async { implicit request =>
//    val adr = addresses.list()
//    adr.map(c => Ok(views.html.customer.customeradd(CustomerForm,c)))
//    //    Ok(views.html.index("Customer added"))
//  }
//
//  //  REST API
//  def getCustomersApi = Action.async {implicit request =>
//    val Customer = customersRepo.list()
//    Customer.map(p =>
//      Ok(Json.toJson(p))
//    )
//  }
//  def getCustomerApi(id: Int) = Action.async {implicit request =>
//    val customer = customersRepo.getByIdAsync(id)
//      customer.map(x => x match {
//      case Some(p) => Ok(Json.toJson(p))
//    })
//  }
//  def addCustomerApi = Action { implicit request =>
//    val req = request.body.asJson.get
//    var customer:Customer = req.as[Customer]
//    customersRepo.create(customer.firstName,customer.lastName,customer.addressId)
//    Ok(request.body.asJson.get)
//  }

}
//case class CreateCustomerForm(firstName: String,lastName: String, addressId: Int)
//case class UpdateCustomerForm(id: Int, firstName: String,lastName: String, addressId: Int)
