organization := "io.dylemma"

version := "1.2"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

bintrayPublishSettings

scalaVersion := "2.10.5"

crossScalaVersions := Seq("2.10.5", "2.11.6")

scalacOptions in (Compile, doc) += "-implicits"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.1.5" % "test"
