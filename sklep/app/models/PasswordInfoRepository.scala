package models

import com.google.common.collect.Table
import com.mohiva.play.silhouette.api.LoginInfo
import com.mohiva.play.silhouette.api.util.PasswordInfo
import com.mohiva.play.silhouette.persistence.daos.DelegableAuthInfoDAO
import com.sun.javadoc.Tag
import javax.inject.Inject
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}
import scala.reflect.ClassTag

//class PasswordInfoRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext,implicit val classTag: ClassTag[PasswordInfo])
//  extends DelegableAuthInfoDAO[PasswordInfo]
//{
//  val dbConfig = dbConfigProvider.get[JdbcProfile]
//
//  import dbConfig._
//  import profile.api._
//
//  class PasswordInfoTable(tag: Tag) extends Table[PasswordInfoDTO](tag, "passwordInfo") {
//    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
//    def providerId = column[String]("providerId")
//    def providerKey = column[String]("providerKey")
//    def password = column[String]("password")
//    def hasher = column[String]("hasher")
//
//    def * = (id, providerId, providerKey, hasher, password) <> ((PasswordInfoDTO.apply _).tupled, PasswordInfoDTO.unapply)
//  }
//
//  override def find(loginInfo: LoginInfo): Future[Option[PasswordInfo]] = ???
//
//  override def add(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = ???
//
//  override def update(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = ???
//
//  override def save(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = ???
//
//  override def remove(loginInfo: LoginInfo): Future[Unit] = ???
//}
