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

developers := List(
  Developer(
    id    = "ivtoskov",
    name  = "Ivaylo Toskov",
    email = "kennelcrash@gmail.com",
    url   = url("https://github.com/ivtoskov")
  )
)

sonatypeProfileName := "ch.ethz.acl"