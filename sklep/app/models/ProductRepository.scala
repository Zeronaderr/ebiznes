package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class ProductRepository @Inject() (dbConfigProvider: DatabaseConfigProvider, categoryRepository: ProductCategoryRepository, brandRepository: BrandRepository)(implicit ec: ExecutionContext) {
  private val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._


  private class ProductTable(tag: Tag) extends Table[Product](tag, "product") {

    /** The ID column, which is the primary key, and auto incremented */
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

    /** The name column */
    def name = column[String]("name")

    /** The age column */
    def description = column[String]("description")

    def categoryId = column[Int]("category")

    def price = column[Float]("price")

    def img = column[String]("img")

    def brandId = column[Int]("brandId")

    def category_fk = foreignKey("cat_fk",categoryId, cat)(_.id)

    /**
     * This is the tables default "projection".
     *
     * It defines how the columns are converted to and from the Person object.
     *
     * In this case, we are simply passing the id, name and page parameters to the Person case classes
     * apply and unapply methods.
     */
    def * = (id, name, description, categoryId,price,img,brandId) <> ((Product.apply _).tupled, Product.unapply)

  }

  /**
   * The starting point for all queries on the people table.
   */

  import categoryRepository.ProductCategoryTable
  import brandRepository.BrandTable

  private val product = TableQuery[ProductTable]

  private val cat = TableQuery[ProductCategoryTable]

  private val brands = TableQuery[BrandTable]

  /**
   * Create a person with the given name and age.
   *
   * This is an asynchronous operation, it will return a future of the created person, which can be used to obtain the
   * id for that person.
   */
  def create(name: String, description: String, category: Int,price: Float,img: String,brandId: Int): Future[Product] = db.run {
    // We create a projection of just the name and age columns, since we're not inserting a value for the id column
    (product.map(p => (p.name, p.description,p.categoryId,p.price,p.img,p.brandId))
      // Now define it to return the id, because we want to know what id was generated for the person
      returning product.map(_.id)
      // And we define a transformation for the returned value, which combines our original parameters with the
      // returned id
      into {case ((name,description,category,price,img,brandId),id) => Product(id,name, description,category,price,img,brandId)}
      // And finally, insert the product into the database
      ) += (name, description,category,price,img,brandId)
  }

  /**
   * List all the people in the database.
   */
  def list(): Future[Seq[Product]] = db.run {
    product.result
  }

  def getByCategory(category_id: Int): Future[Seq[Product]] = db.run {
    product.filter(_.categoryId === category_id).result
  }

  def getById(id: Long): Future[Product] = db.run {
    product.filter(_.id === id).result.head
  }

  def getByIdOption(id: Long): Future[Option[Product]] = db.run {
    product.filter(_.id === id).result.headOption
  }

  def getByCategories(category_ids: List[Int]): Future[Seq[Product]] = db.run {
    product.filter(_.categoryId inSet category_ids).result
  }

  def delete(id: Long): Future[Unit] = db.run(product.filter(_.id === id).delete).map(_ => ())

  def update(id: Long, new_product: Product): Future[Unit] = {
    val productToUpdate: Product = new_product.copy(id)
    db.run(product.filter(_.id === id).update(productToUpdate)).map(_ => ())
  }

}

