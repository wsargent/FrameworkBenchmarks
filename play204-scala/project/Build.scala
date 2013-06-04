import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

  val appName         = "play204-scala"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "mysql" % "mysql-connector-java" % "5.1.22"
  )

  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
  )

}
