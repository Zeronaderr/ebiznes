package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Success, Try}

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

  private val addressRepo = TableQuery[AddressTable]

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
    (addressRepo.map(c => c.address)
      returning addressRepo.map(_.id)
      into ((address, id) => Address(id, address))
      ) += address
  }

  def getAddressByName(address: String): Future[Address] = db.run {
    addressRepo.filter(_.address === address).result.headOption.map{
      case Some(addr: Address) => addr
      case None => Await.result(create(address),Duration.Inf)
    };
  }

  def delete(id: Int): Future[Unit] = db.run(addressRepo.filter(_.id === id).delete).map(_ => ())

  def list(): Future[Seq[Address]] = db.run {
    addressRepo.result
  }
}

