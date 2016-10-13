import sbt.Keys._
import sbt._
import org.scalajs.sbtplugin._
import ScalaJSPlugin.autoImport._

object HmrcBuild extends Build {

  import uk.gov.hmrc.SbtAutoBuildPlugin
  import uk.gov.hmrc.versioning.SbtGitVersioning
  import SbtAutoBuildPlugin._
  import Dependencies._
  
  val nameApp = "paye-estimator"

  lazy val root = Project(nameApp, file("."))
    .aggregate(libraryJS)
    .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, ScalaJSPlugin)
    .settings(
      autoSourceHeader := false,
      scalaVersion := "2.11.8",
      libraryDependencies ++= Seq(
        Test.scalaTest,
        Test.pegdown
      ),
      resolvers += Resolver.typesafeRepo("releases"),
      crossScalaVersions := Seq("2.11.8"),
      //Rhino JS interpreter disabled, Node.js must be installed
      scalaJSUseRhino := false,
      //add js libraries
      skip in packageJSDependencies := false,
      //minify
      scalaJSStage := FullOptStage
    )
    //.dependsOn(jsLib)

  val library = crossProject.in(file(".")).settings(
    name := "fooLib"
  ).jsSettings(
    // JS-specific settings here
  )
  lazy val libraryJS = library.js
}

object Dependencies {

  object Compile {
  }

  sealed abstract class Test(scope: String) {
    val scalaTest = "org.scalatest" %% "scalatest" % "3.0.0" % scope
    val pegdown = "org.pegdown" % "pegdown" % "1.6.0" % scope
  }

  object Test extends Test("test")

  object IntegrationTest extends Test("it")

}