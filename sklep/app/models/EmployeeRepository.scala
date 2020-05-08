package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class EmployeeRepository @Inject() (dbConfigProvider: DatabaseConfigProvider,addressRepository: AddressRepository)(implicit ec: ExecutionContext) {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class EmployeeTable(tag: Tag) extends Table[Employee](tag, "Employee") {
    def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
    def firstName = column[String]("firstName")
    def lastName = column[String]("lastName")
    def addressId = column[Int]("addressId")
//    def address_fk = foreignKey("address_fk",addressId,adr)(_.id)
    def * = (id, firstName,lastName,addressId) <> ((Employee.apply _).tupled, Employee.unapply)
  }

  import addressRepository.AddressTable
  private val adr = TableQuery[AddressTable]
  val employeeRepo = TableQuery[EmployeeTable]

  def create(firstName: String,lastName: String,addressId: Int): Future[Employee] = db.run {
    (employeeRepo.map(c => (c.firstName,c.lastName,c.addressId))
      returning employeeRepo.map(_.id)
      into {case ((firstName,lastName,addressId),id) => Employee(id,firstName, lastName,addressId)}
      // And finally, insert the product into the database
      ) += (firstName,lastName,addressId)
  }

  def getByIdAsync(id: Int): Future[Option[Employee]] = db.run{
    employeeRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Int): Future[Employee] = db.run{
    employeeRepo.filter(_.id === id).result.head
  }

  def update(id: Int, new_Employee: Employee): Future[Unit] = {
    val EmployeeToUpdate: Employee = new_Employee.copy(id)
    db.run(employeeRepo.filter(_.id === id).update(EmployeeToUpdate)).map(_ => ())
  }
  def delete(id: Int): Future[Unit] = db.run(employeeRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[Employee]] = db.run {
    employeeRepo.result
  }
}

