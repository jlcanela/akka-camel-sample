
resolvers += Resolver.url("akka snapshot", new URL("http://repo.akka.io/snapshots/"))(Patterns("[organisation]/[module]_[scalaVersion]_[sbtVersion]/[revision]/[artifact]-[revision].[ext]"))

addSbtPlugin("com.typesafe.akka" % "akka-sbt-plugin" % "2.2-SNAPSHOT")