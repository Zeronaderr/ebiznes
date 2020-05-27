package models

import javax.inject.{Inject, Singleton}
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

import scala.concurrent.ExecutionContext

@Singleton
class UserTokenRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext)
{
  val dbConfig = dbConfigProvider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  class UserTokenTable(tag: Tag) extends Table[UserToken](tag, "UserToken") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def userId = column[Long]("orderId")
    def email = column[String]("email")
    def isSigned = column[Boolean]("isSigned")
    def * = (id, userId,email,isSigned) <> ((UserToken.apply _).tupled, UserToken.unapply)
  }

  val userTokens = TableQuery[UserTokenTable]
  def create(userId: Long,email: String,isSigned: Boolean) = db.run {
    (userTokens.map(ut => (ut.userId,ut.email,isSigned))
      returning userTokens.map(_.id)
      into {case ((userId,email,isSigned),id) => UserToken(id, userId,email,isSigned)}
      ) += (userId,email,isSigned)
  }

}
