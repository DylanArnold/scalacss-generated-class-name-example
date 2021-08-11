ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "test4",
    libraryDependencies ++= Seq(
      "com.github.japgolly.scalacss" %% "core" % "0.7.0"
    )
  )
