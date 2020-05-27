package models

import java.util.Date

import akka.http.scaladsl.model.DateTime
import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

@Singleton
class OrderRepository @Inject() (dbConfigProvider: DatabaseConfigProvider,val customerRepository: CustomerRepository,val productRepository: ProductRepository,val shipperRepository: ShipperRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class OrderTable(tag: Tag) extends Table[Order](tag, "order") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def customerId = column[Int]("customerId")
    def productId = column[Long]("productId")
    def shipperId = column[Int]("shipperId")
    def orderDate = column[String]("orderDate")
    def orderState = column[Int]("orderState")
    def customer_fk = foreignKey("customer_fk",customerId,cst)(_.id)
    def product_fk = foreignKey("product_fk",productId,prd)(_.id)
    def shipper_fk = foreignKey("shipper_fk",shipperId,shp)(_.id)
    def * = (id, customerId,productId,shipperId,orderDate,orderState) <> ((Order.apply _).tupled, Order.unapply)
  }

  import customerRepository.CustomerTable
  import productRepository.ProductTable
  import shipperRepository.ShipperTable

  private val cst = TableQuery[CustomerTable]
  private val prd = TableQuery[ProductTable]
  private val shp = TableQuery[ShipperTable]
  private val orderRepo = TableQuery[OrderTable]

  def create(customerId: Int,productId: Long,shipperId: Int,orderDate: String,orderState: Int): Future[Order] = db.run {
    (orderRepo.map(c => (c.customerId,c.productId,c.shipperId,c.orderDate,c.orderState))
      returning orderRepo.map(_.id)
      into {case ((customerId,productId,shipperId,orderDate,orderState),id) => Order(id,customerId, productId,shipperId,orderDate,orderState)}
      ) += (customerId,productId,shipperId,orderDate,orderState)
  }

  def getByIdAsync(id: Int): Future[Option[Order]] = db.run{
    orderRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Order] = db.run{
    orderRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_Order: Order): Future[Unit] = {
    val OrderToUpdate: Order = new_Order.copy(id)
    db.run(orderRepo.filter(_.id === id).update(OrderToUpdate)).map(_ => ())
  }

  def payForOrder(orderId: Int): Future[Seq[Order]] = db.run {
    var order: Order = Await.result(getById(orderId),Duration.Inf);
    val new_order: Order = new Order(orderId,order.customerId,order.productId,order.shipperId,order.orderDate,2)
    update(orderId,new_order)
    orderRepo.result
  }

  def delete(id: Int): Future[Unit] = db.run(orderRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[Order]] = db.run {
    orderRepo.result
  }
}

