package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class AddressRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class AddressTable(tag: Tag) extends Table[Address](tag, "address") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def address = column[String]("address")
    def * = (id, address) <> ((Address.apply _).tupled, Address.unapply)
  }

  val addressRepo = TableQuery[AddressTable]

  def getByIdAsync(id: Int): Future[Option[Address]] = db.run{
    addressRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Address] = db.run{
    addressRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_productCategory: Address): Future[Unit] = {
    val addressToUpdate: Address = new_productCategory.copy(id)
    db.run(addressRepo.filter(_.id === id).update(addressToUpdate)).map(_ => ())
  }

  def create(address: String): Future[Address] = db.run {
    (addressRepo.map(c => (c.address))
      returning addressRepo.map(_.id)
      into ((address, id) => Address(id, address))
      ) += (address)
  }

  def delete(id: Int): Future[Unit] = db.run(addressRepo.filter(_.id === id).delete).map(_ => ())

  def list(): Future[Seq[Address]] = db.run {
    addressRepo.result
  }
}

