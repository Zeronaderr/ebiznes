package controllers

import javax.inject.Inject
import com.mohiva.play.silhouette.api._
import com.mohiva.play.silhouette.api.exceptions.ProviderException
import com.mohiva.play.silhouette.api.repositories.AuthInfoRepository
import com.mohiva.play.silhouette.api.services.AuthenticatorService
import com.mohiva.play.silhouette.impl.providers._
import com.mohiva.play.silhouette.impl.providers.oauth2.GoogleProvider
import models.{User, UserRepository}
import play.api.i18n.{I18nSupport, Messages}
import play.api.libs.json.Json
import play.api.mvc._
import play.filters.csrf.CSRFAddToken
import utils.DefaultEnv

import scala.concurrent.{ExecutionContext, Future}
import scala.concurrent.duration._
import scala.language.postfixOps



class SocialAuthController @Inject() (
                 silhouette: Silhouette[DefaultEnv],
                 userService: UserRepository,
                 addToken: CSRFAddToken,
                 socialProviderRegistry: SocialProviderRegistry,
                 cc: MessagesControllerComponents) (implicit ec: ExecutionContext)
extends AbstractController(cc) with I18nSupport with Logger {

  def authenticate(provider: String) = addToken(Action.async { implicit request =>
      (socialProviderRegistry.get[SocialProvider](provider) match {
        case Some(p: SocialProvider with CommonSocialProfileBuilder) =>
          p.authenticate().flatMap {
            case Left(result) => Future.successful(result)
            case Right(authInfo) => for {
              profile <- p.retrieveProfile(authInfo)
              user <- userService.create(profile.loginInfo.providerID, profile.loginInfo.providerKey, profile.email.toString).map(x => userService.ConvertToUser(x))
              authInfo <- silhouette.env.authenticatorService.create(profile.loginInfo)
              authenticator <- silhouette.env.authenticatorService.create(profile.loginInfo)
              token <- silhouette.env.authenticatorService.init(authenticator)
              result <- silhouette.env.authenticatorService.embed(token, Redirect("http://localhost:3000/products"))
            } yield result.withCookies(Cookie("token",token, httpOnly = false))
            //              {
            //              silhouette.env.eventBus.publish(LoginEvent(user, request))
            //              Ok(Json.obj("token" -> result))
            //            }
          }
        case e =>
          logger.error("err",new ProviderException(s"Cannot authenticate with unexpected social provider $provider"))
          Future.failed(new ProviderException(s"Cannot authenticate with unexpected social provider $provider"))
      }).recover {
        case e: ProviderException =>
          logger.error("Unexpected provider error", e)
          Unauthorized(Json.obj("message" -> Messages("could.not.authenticate")))
        case ex: Exception =>
          logger.error("Unexpected provider error", ex)
          Unauthorized(Json.obj("message" -> Messages("could.not.authenticate")))
      }

  })

}
