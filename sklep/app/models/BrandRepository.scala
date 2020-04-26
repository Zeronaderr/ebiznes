package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class BrandRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class BrandTable(tag: Tag) extends Table[Brand](tag, "brand") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def * = (id, name) <> ((Brand.apply _).tupled, Brand.unapply)
  }

  val brandTable = TableQuery[BrandTable]

  def create(name: String): Future[Brand] = db.run {
    (brandTable.map(c => (c.name))
      returning brandTable.map(_.id)
      into ((name, id) => Brand(id, name))
      ) += (name)
  }

  def getByIdAsync(id: Int): Future[Option[Brand]] = db.run{
    brandTable.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Brand] = db.run{
    brandTable.filter(_.id === id).result.head
  }

  def update(id: Int, new_Brand: Brand): Future[Unit] = {
    val BrandToUpdate: Brand = new_Brand.copy(id)
    db.run(brandTable.filter(_.id === id).update(BrandToUpdate)).map(_ => ())
  }

  def delete(id: Int): Future[Unit] = db.run(brandTable.filter(_.id === id).delete).map(_ => ())

  def list(): Future[Seq[Brand]] = db.run {
    brandTable.result
  }
}

