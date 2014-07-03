name := "phantom-table-constructor-race"

organization := "com.migesok"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.2"

resolvers += "Typesafe repository releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.newzly" %% "phantom-dsl" % "0.8.0",  
  "org.scalatest" %% "scalatest" % "2.2.0" % "test"
)
