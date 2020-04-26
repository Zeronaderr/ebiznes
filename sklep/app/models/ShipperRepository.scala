package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ShipperRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class ShipperTable(tag: Tag) extends Table[Shipper](tag, "Shipper") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def * = (id, name) <> ((Shipper.apply _).tupled, Shipper.unapply)
  }

  val shipperRepo = TableQuery[ShipperTable]

  def create(name: String): Future[Shipper] = db.run {
    (shipperRepo.map(c => (c.name))
      returning shipperRepo.map(_.id)
      into ((name, id) => Shipper(id, name))
      ) += (name)
  }

  def getByIdAsync(id: Int): Future[Option[Shipper]] = db.run{
    shipperRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Shipper] = db.run{
    shipperRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_Shipper: Shipper): Future[Unit] = {
    val ShipperToUpdate: Shipper = new_Shipper.copy(id)
    db.run(shipperRepo.filter(_.id === id).update(ShipperToUpdate)).map(_ => ())
  }
  def delete(id: Int): Future[Unit] = db.run(shipperRepo.filter(_.id === id).delete).map(_ => ())

  def list(): Future[Seq[Shipper]] = db.run {
    shipperRepo.result
  }
}

