package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class CustomerRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CustomerTable(tag: Tag) extends Table[Customer](tag, "customer") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("firstName")
    def lastName = column[String]("lastName")
    def addressId = column[Int]("addressId")
    def * = (id, firstName,lastName,addressId) <> ((Customer.apply _).tupled, Customer.unapply)
  }

  val customerRepo = TableQuery[CustomerTable]

  def create(firstName: String,lastName: String,addressId: Int): Future[Customer] = db.run {
    (customerRepo.map(c => (c.firstName,c.lastName,c.addressId))
      returning customerRepo.map(_.id)
      into {case ((firstName,lastName,addressId),id) => Customer(id,firstName, lastName,addressId)}
      // And finally, insert the product into the database
      ) += (firstName,lastName,addressId)
  }

  def getByIdAsync(id: Int): Future[Option[Customer]] = db.run{
    customerRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Customer] = db.run{
    customerRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_Customer: Customer): Future[Unit] = {
    val CustomerToUpdate: Customer = new_Customer.copy(id)
    db.run(customerRepo.filter(_.id === id).update(CustomerToUpdate)).map(_ => ())
  }
  def delete(id: Int): Future[Unit] = db.run(customerRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[Customer]] = db.run {
    customerRepo.result
  }
}
