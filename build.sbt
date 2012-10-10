name := "dispatch-lift-json"

version := "0.8.8"

organization := "net.databinder"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.8",
  "net.liftweb" %% "lift-json" % "2.5-SNAPSHOT",
  "net.databinder" %% "dispatch-http" % "0.8.8" % "test"
)
