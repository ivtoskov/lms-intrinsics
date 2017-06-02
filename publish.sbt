publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra in Global := {
  <developers>
    <developer>
      <id>ivtoskov</id>
      <name>Ivaylo Toskov</name>
      <url>https://github.com/ivtoskov</url>
    </developer>
  </developers>
}

sonatypeProfileName := "ch.ethz.acl"

