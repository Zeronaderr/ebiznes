package controllers

import com.mohiva.play.silhouette.api._
import com.mohiva.play.silhouette.impl.providers._
import com.google.inject.Inject
import com.mohiva.play.silhouette.api.Silhouette
import com.mohiva.play.silhouette.api.repositories.AuthInfoRepository
import com.mohiva.play.silhouette.api.util.{PasswordHasher, PasswordHasherRegistry}
import models.{SignUp, User, UserRepository}
import play.api.http.MediaRange.parse
import play.api.i18n.{I18nSupport, Messages, MessagesApi}
import com.mohiva.play.silhouette.impl.providers.CredentialsProvider
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, MessagesAbstractController, MessagesControllerComponents}
import play.mvc.{Action, Controller}
import utils.DefaultEnv

import scala.concurrent.Future
import scala.concurrent.ExecutionContext

class SignUpController @Inject()(silhouette: Silhouette[DefaultEnv],
                                 userService: UserRepository,
                                 messagesApi: MessagesApi,
                                 passwordHasher: PasswordHasherRegistry,
                                 authInfoRepository: AuthInfoRepository, cc: MessagesControllerComponents) (implicit ec: ExecutionContext)
  extends AbstractController(cc) with I18nSupport{

  def signUp = Action { implicit request =>
    val req = request.body.asJson.get
    var signUpData:SignUp = req.as[SignUp]
    val loginInfo = LoginInfo(CredentialsProvider.ID,signUpData.email)
    userService.retrieve(loginInfo).flatMap{
      case Some(user) => Future.successful(BadRequest(Json.obj("message" -> Messages("user.exists"))))
      case None =>
        val authInfo = passwordHasher.current.hash(signUpData.password)
        val user = userService.create(CredentialsProvider.ID,signUpData.email,signUpData.email)
        for{
          authInfo <- authInfoRepository.add(loginInfo, authInfo)
          authenticator <- silhouette.env.authenticatorService.create(loginInfo)
          token <- silhouette.env.authenticatorService.init(authenticator)
        } yield {
          Ok(Json.obj("token" -> token))
        }
    }
    Unauthorized(Json.obj("message" -> Messages("invalid.data")))
  }
}
