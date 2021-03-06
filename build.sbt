enablePlugins(SbtGitVersioning, ScalaJSPlugin, UniversalPlugin)

name := "paye-estimator"

LocalTempBuildSettings.localDefaultSettings

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8")

libraryDependencies ++= Seq(
      Dependencies.scalajsTime.value,
      Dependencies.scalajsJson.value,
      Dependencies.tests.scalajsenvs,
      "org.scalatest" %%% "scalatest" % "3.0.1" % "test",
      "org.pegdown" % "pegdown" % "1.6.0"
    )

scalaJSStage in Global := FastOptStage

topLevelDirectory := None

// generate commit.mf file for non-standard builds (see https://github.com/hmrc/releaser#additional-filesnon-standard-artefacts)
resourceGenerators in Compile <+= Def.task {
      val commitMfFile = target.value / "commit.mf"
      IO.write(commitMfFile, CommitMF().toString)
      Seq(commitMfFile)
}

val commitMfTask = taskKey[File]("commit-mf")
commitMfTask := target.value / "commit.mf"
artifact in (Compile, commitMfTask) ~= { (art:Artifact) =>
      art.copy("commit", "mf", "mf")
}
addArtifact(artifact in (Compile, commitMfTask), commitMfTask in Compile)

stagingDirectory := (target.value / "scala-2.11")

mappings in Universal ++= Seq((target.value / "scala-2.11" / s"${name.value}-opt.js", s"${name.value}.js"))

val packageTgz = taskKey[File]("package-tgz")
packageTgz := target.value / "universal" / (name.value + "-" + version.value + ".tgz")

artifact in (Universal, packageTgz) ~= { (art:Artifact) => art.copy(`type` = "tgz", extension = "tgz") }
addArtifact(artifact in (Universal, packageTgz), packageTgz in Universal)


publish <<= publish dependsOn (packageZipTarball in Universal)

publishM2 <<= publishM2 dependsOn (packageZipTarball in Universal)

publishLocal <<= publishLocal dependsOn (packageZipTarball in Universal)
