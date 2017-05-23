name := "lms-intrinsics"

scalaVersion := "2.11.2"

organization := "ch.ethz.acl"

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/ivtoskov/lms-intrinsics"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/ivtoskov/lms-intrinsics"),
    "scm:git@github.com:ivtoskov/lms-intrinsics.git"
  )
)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaOrganization := "org.scala-lang.virtualized"

libraryDependencies += "org.scala-lang.lms" %% "lms-core" % "1.0.0-SNAPSHOT"

libraryDependencies += "ch.ethz.acl" %% "scala-unsigned" % "0.1-SNAPSHOT"

libraryDependencies += "org.scala-lang.virtualized" % "scala-compiler" % "2.11.2"

libraryDependencies += "org.scala-lang.virtualized" % "scala-library" % "2.11.2"

libraryDependencies += "org.scala-lang.virtualized" % "scala-reflect" % "2.11.2"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.2"

scalacOptions += "-Yvirtualize"

scalacOptions += "-deprecation"

    