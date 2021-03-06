name := "TaxCalc"


version := "0.1"

scalaVersion := "2.13.1"



libraryDependencies += "com.typesafe.slick" %% "slick" % "3.3.2"
libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.4"
libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.3.2"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.11"



libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.8.0"


libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % Test
