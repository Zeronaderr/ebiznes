package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class DiscountRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class DiscountTable(tag: Tag) extends Table[Discount](tag, "Discount") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def value = column[Float]("value")
    def * = (id, value) <> ((Discount.apply _).tupled, Discount.unapply)
  }

  val discountRepo = TableQuery[DiscountTable]

  def create(value: Float): Future[Discount] = db.run {
    (discountRepo.map(c => (c.value))
      returning discountRepo.map(_.id)
      into ((value, id) => Discount(id, value))
      ) += (value)
  }

  def getByIdAsync(id: Int): Future[Option[Discount]] = db.run{
    discountRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Discount] = db.run{
    discountRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_Discount: Discount): Future[Unit] = {
    val DiscountToUpdate: Discount = new_Discount.copy(id)
    db.run(discountRepo.filter(_.id === id).update(DiscountToUpdate)).map(_ => ())
  }
  def delete(id: Int): Future[Unit] = db.run(discountRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[Discount]] = db.run {
    discountRepo.result
  }
}

