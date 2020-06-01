package models

import java.lang.Exception

import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import com.mohiva.play.silhouette.api.LoginInfo
import com.mohiva.play.silhouette.api.services.IdentityService
import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import play.api.libs.json.JsResult.Exception
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class UserRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext)  extends IdentityService[User] {
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class UserTable(tag: Tag) extends Table[UserDTO](tag, "user") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def providerId = column[String]("providerId")
    def providerKey = column[String]("providerKey")
    def email = column[String]("email")

    def * = (id, providerId, providerKey, email) <> ((UserDTO.apply _).tupled,UserDTO.unapply)
  }

  val userRepo = TableQuery[UserTable]

  def create(providerId: String,providerKey: String,email: String): Future[UserDTO] = db.run {
    (userRepo.map(c => (c.providerId,c.providerKey,c.email))
      returning userRepo.map(_.id)
      into {case ((providerId,providerKey,email),id) => UserDTO(id,providerId, providerKey,email)}
      ) += (providerId,providerKey,email)
  }

  def getByIdAsync(id: Long): Future[Option[UserDTO]] = db.run{
    userRepo.filter(_.id === id).result.headOption
  }

  def getById(id: Long): Future[UserDTO] = db.run{
    userRepo.filter(_.id === id).result.head
  }
  def getByEmail(email: String): Future[UserDTO] = db.run {
    userRepo.filter(_.email === email).result.head
  }
  def update(id: Long, newUser: UserDTO): Future[Unit] = {
    val userToUpdate: UserDTO = newUser.copy(id)
    db.run(userRepo.filter(_.id === id).update(userToUpdate)).map(_ => ())
  }
  def delete(id: Long): Future[Unit] = db.run(userRepo.filter(_.id === id).delete).map(_ => ())
  def list(): Future[Seq[UserDTO]] = db.run {
    userRepo.result
  }

  override def retrieve(loginInfo: LoginInfo): Future[Option[User]] = db.run {
      userRepo.filter(x => x.providerId === loginInfo.providerID && x.providerKey === loginInfo.providerKey).result.headOption.map(x => x.map(y => ConvertToUser(y)))
  }

  def ConvertToUser(u: UserDTO) =
    User(u.id,LoginInfo(u.providerId,u.providerKey),u.email)
  def ConvertToDTO(u:User) =
    UserDTO(u.id,u.loginInfo.providerID,u.loginInfo.providerKey,u.email)
}
