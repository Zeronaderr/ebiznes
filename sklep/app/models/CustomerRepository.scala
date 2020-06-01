package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json.JsResult.Exception
import slick.jdbc.JdbcProfile

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}

@Singleton
class CustomerRepository @Inject() (dbConfigProvider: DatabaseConfigProvider,val userRepository: UserRepository,val addressRepository: AddressRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class CustomerTable(tag: Tag) extends Table[Customer](tag, "customer") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("firstName")
    def lastName = column[String]("lastName")
    def addressId = column[Int]("addressId")
    def userId = column[Long]("userId")

//    def address_fk = foreignKey("adr_fk",addressId,adr)(_.id)

    def addressForeignKey = foreignKey("address_fk", addressId, addressTable)(_.id, onDelete= ForeignKeyAction.Restrict)

    def * = (id, firstName,lastName,addressId,userId) <> ((Customer.apply _).tupled, Customer.unapply)
  }
  import addressRepository.AddressTable

  private val addressTable = TableQuery[AddressTable]
  private val customerRepo = TableQuery[CustomerTable]

  def create(firstName: String,lastName: String,addressId: Int,userId: Long): Future[Customer] = db.run {
    try {
      (customerRepo.map(c => (c.firstName, c.lastName, c.addressId, c.userId))
        returning customerRepo.map(_.id)
        into { case ((firstName, lastName, addressId, userId), id) => Customer(id, firstName, lastName, addressId, userId) }
        ) += (firstName, lastName, addressId, userId)
    } catch {
      case e: Exception => null
    }
  }
  def create(userId: Int,addressId: Int): Future[Customer] = db.run {
      (customerRepo.map(c => (c.userId,c.addressId))
        returning customerRepo.map(_.id)
        into {case ((userId,addressId),id) => Customer(id,"firstName","lastName",addressId,userId)}
        ) += (userId,addressId)

  }
  def getByIdAsync(id: Int): Future[Option[Customer]] = db.run{
    customerRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Customer] = db.run{
    customerRepo.filter(_.id === id).result.head
  }

  def getByUserId(userId: Long,addressId: Int): Future[Customer] = db.run {
    val c = Await.result(getByUserId(userId),Duration.Inf);
    if(c == None || c.get == null)
    {
      return create("first","last",addressId,userId);
    }
    return Future {c.get};
  }

  def getByUserId(Id: Long): Future[Option[Customer]] = db.run {
    customerRepo.filter(_.userId === Id).result.headOption
  }
  def getByEmail(email: String,addressId: Int): Future[Customer] = db.run {
    try {

      val usr = Await.result(userRepository.getByEmail(email), Duration.Inf);
      //      val usr = userRepository.getByEmail(email);
      //      usr.map(x => x match {
      //      case Some(p) => {
      //        val c = getByUserId(p.id);
      //        c.map(y => y match {
      //          case Some(cust) => cust
      //          case None => create("first","last",addressId,p.id)
      //        })
      //      }
      //      case None => {
      //        null
      //      }
      //    })
      //    if(usr != None && usr.get.id != None) {
      //      usr.
      val c = Await.result(getByUserId(usr.id), Duration.Inf); //.map(x => x).getOrElse(create("first","last",addressId,usr.id));
      if (c == None || c.get == null) {
        return create("first", "last", addressId, usr.id);
      }
      return Future {
        c.get
      };
    }
    catch {
      case e: Exception => null
    }
//      flatMap {
//        case Some(c: Customer) => c
//        case None => Await.result((create(usr.id,addressId)),Duration.Inf);
//      };
//      customerRepo.filter(_.userId === usr.id).result.headOption.map{
//
//        case Some(cust: Customer) => cust
//        case None => Await.result(create(usr.id,addressId),Duration.Inf);
//      };
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

