package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ProductCategoryRepository @Inject() (dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class ProductCategoryTable(tag: Tag) extends Table[ProductCategory](tag, "productCategory") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def name = column[String]("name")
    def * = (id, name) <> ((ProductCategory.apply _).tupled, ProductCategory.unapply)
  }

  val category = TableQuery[ProductCategoryTable]

  def create(name: String): Future[ProductCategory] = db.run {
    (category.map(c => (c.name))
      returning category.map(_.id)
      into ((name, id) => ProductCategory(id, name))
      ) += (name)
  }

  def getByIdAsync(id: Int): Future[Option[ProductCategory]] = db.run{
    category.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[ProductCategory] = db.run{
    category.filter(_.id === id).result.head
  }

  def update(id: Int, new_productCategory: ProductCategory): Future[Unit] = {
    val productCategoryToUpdate: ProductCategory = new_productCategory.copy(id)
    db.run(category.filter(_.id === id).update(productCategoryToUpdate)).map(_ => ())
  }
  def delete(id: Int): Future[Unit] = db.run(category.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[ProductCategory]] = db.run {
    category.result
  }
}

