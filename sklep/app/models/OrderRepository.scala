package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class OrderRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class OrderTable(tag: Tag) extends Table[Order](tag, "Order") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def customerId = column[Int]("customerId")
    def productId = column[Int]("productId")
    def * = (id, customerId,productId) <> ((Order.apply _).tupled, Order.unapply)
  }

  val orderRepo = TableQuery[OrderTable]

  def create(customerId: Int,productId: Int): Future[Order] = db.run {
    (orderRepo.map(c => (c.customerId,c.productId))
      returning orderRepo.map(_.id)
//      into ((productId,customerId, id) => Order(id, customerId,productId)
      into {case ((productId,customerId),id) => Order(id,customerId, productId)}
      ) += (customerId,productId)
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
  def delete(id: Int): Future[Unit] = db.run(orderRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[Order]] = db.run {
    orderRepo.result
  }
}

