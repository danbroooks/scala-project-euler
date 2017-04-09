name := "euler scala"

scalaVersion := "2.11.7"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies += "org.spire-math" %% "spire" % "0.13.0"
libraryDependencies += "org.typelevel" %% "cats" % "0.9.0"
libraryDependencies += compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
