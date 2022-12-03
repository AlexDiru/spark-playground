ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

val sparkVersion = "3.2.2"
ThisBuild / libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion % "provided"
ThisBuild / libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"

lazy val root = (project in file("."))
  .settings(
    name := "spark-playground",
    idePackagePrefix := Some("com.alexdiru.sparkplayground")
  )
