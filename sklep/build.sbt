

name := "sklep"
 
version := "1.0" 
      
lazy val `sklep` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
resolvers += Resolver.jcenterRepo
scalaVersion := "2.12.2"
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "4.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "4.0.0",
  "com.mohiva" %% "play-silhouette" % "6.1.0",
  "net.codingwell" %% "scala-guice" % "4.2.1",
  "com.iheart" %% "ficus" % "1.4.7",
  "com.mohiva" %% "play-silhouette-password-bcrypt" % "6.1.0",
  "com.mohiva" %% "play-silhouette-crypto-jca" % "6.1.0",
  "com.mohiva" %% "play-silhouette-persistence" % "6.1.0",
  "com.mohiva" %% "play-silhouette-testkit" % "6.1.0" % "test",
  ehcache, ws , specs2 % Test , guice,"org.xerial" % "sqlite-jdbc" % "3.30.1")
//libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

      