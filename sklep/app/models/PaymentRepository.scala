package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class PaymentRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class PaymentTable(tag: Tag) extends Table[Payment](tag, "Payment") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def orderId = column[Int]("orderId")
    def * = (id, orderId) <> ((Payment.apply _).tupled, Payment.unapply)
  }

  val paymentRepo = TableQuery[PaymentTable]

  def create(orderId: Int): Future[Payment] = db.run {
    (paymentRepo.map(c => (c.orderId))
      returning paymentRepo.map(_.id)
      into ((orderId, id) => Payment(id, orderId))
      ) += (orderId)
  }

  def getByIdAsync(id: Int): Future[Option[Payment]] = db.run{
    paymentRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Payment] = db.run{
    paymentRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_Payment: Payment): Future[Unit] = {
    val PaymentToUpdate: Payment = new_Payment.copy(id)
    db.run(paymentRepo.filter(_.id === id).update(PaymentToUpdate)).map(_ => ())
  }
  def delete(id: Int): Future[Unit] = db.run(paymentRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[Payment]] = db.run {
    paymentRepo.result
  }
}

