package controllers

import java.sql.Date
import java.util.Calendar

import javax.inject.Inject
import models.requests.OrderRequest
import models.{Customer, CustomerRepository, Employee, Order, OrderRepository, Product, ProductRepository, Shipper, ShipperRepository}
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.libs.json.Json
import play.api.mvc
import play.api.mvc.{MessagesAbstractController, MessagesControllerComponents}

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success}

class OrderController @Inject()(orderRepo: OrderRepository,productRepo: ProductRepository,val customerRepo: CustomerRepository,shipperRepo: ShipperRepository
                                , cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  val updateOrderForm: Form[UpdateOrderForm] = Form {
    mapping(
      "id" -> number,
      "customerId" -> number,
      "productId" -> number,
      "shipperId" -> number,
      "orderDate" -> nonEmptyText,
      "orderState" -> number
    )(UpdateOrderForm.apply)(UpdateOrderForm.unapply)
  }

  def updateOrder(id: Int) = Action.async { implicit request =>
    var orderForUpdate = orderRepo.getById(id) // get by id
    var products:Seq[Product] = Seq[Product]()
    productRepo.list().onComplete{
      case Success(c) => products = c
      case Failure(_) => print("fail")
    }
    var customers:Seq[Customer] = Seq[Customer]()
    customerRepo.list().onComplete{
      case Success(c) => customers = c
      case Failure(_) => print("fail")
    }
    var shippers:Seq[Shipper] = Seq[Shipper]()
    shipperRepo.list().onComplete{
      case Success(c) => shippers = c
      case Failure(_) => print("fail")
    }
    orderForUpdate.map(order => {
      val prodForm = updateOrderForm.fill(UpdateOrderForm(order.id,order.customerId,order.productId.toInt,order.shipperId,order.orderDate,order.orderState))
      Ok(views.html.orders.orderupdate(prodForm,products,customers,shippers))
    })
    // update values
    // save
    //    Ok(views.html.index("Employee of id = " + id + " updated"))
  }

  def updateOrderHandle = Action.async { implicit request =>
    var products:Seq[Product] = Seq[Product]()
    productRepo.list().onComplete{
      case Success(a) => products = a
      case Failure(_) => print("fail")
    }
    var customers:Seq[Customer] = Seq[Customer]()
    customerRepo.list().onComplete{
      case Success(c) => customers = c
      case Failure(_) => print("fail")
    }
    var shippers:Seq[Shipper] = Seq[Shipper]()
    shipperRepo.list().onComplete{
      case Success(c) => shippers = c
      case Failure(_) => print("fail")
    }
    updateOrderForm.bindFromRequest.fold(
      errorForm => {
        Future.successful(
          BadRequest(views.html.orders.orderupdate(errorForm,products,customers,shippers))
        )
      },
      order => {
        orderRepo.update(order.id, Order(order.id, order.customerId, order.productId, order.shipperId,order.OrderDate,order.OrderState)).map { _ =>
          Redirect(routes.OrderController.updateOrder(order.id)).flashing("success" -> "Order updated")
        }
      }
    )

  }


  def deleteOrder(id: Int): mvc.Action[mvc.AnyContent] = Action { implicit request =>
    orderRepo.delete(id)
    Redirect("/api/orders")
  }

  //  REST API
  def getOrdersApi = Action.async {implicit request =>
    val Order = orderRepo.list()
    Order.map(p =>

      Ok(Json.toJson(p))
    )
  }
  def getOrderApi(id: Int) = Action.async {implicit request =>
    val Order = orderRepo.getByIdAsync(id)
    Order.map {
      case Some(p) => Ok(Json.toJson(p))
    }
  }

  def getOrdersByUserApi(userId: Long) = Action.async { implicit request =>
    val cst = Await.result(customerRepo.getByUserId(userId),Duration.Inf);
    var cstId = 0;
    if(cst != None)
      cstId = cst.get.id;
      val Order = orderRepo.listByUser(cstId);
      Order.map(p =>
        Ok(Json.toJson(p))
    )
  }
  def makeOrderApi = Action { implicit request =>
    val req = request.body.asJson.get;
    var orderReq:OrderRequest = req.as[OrderRequest];
    val response = Await.result(orderRepo.handleOrderRequest(orderReq.userId,orderReq.productId,orderReq.shipperId,orderReq.address),Duration.Inf);
    Ok(Json.toJson(response));
  }

  def addOrderApi = Action { implicit request =>
    val req = request.body.asJson.get
    var Order:Order = req.as[Order]
    orderRepo.create(Order.customerId,Order.productId,Order.shipperId,Calendar.getInstance.getTime.toString,1)
    Ok(request.body.asJson.get)
  }
}
case class UpdateOrderForm(id: Int,customerId: Int, productId: Int,shipperId: Int,OrderDate: String, OrderState: Int)
