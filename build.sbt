name := "get-started-finatra"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % "20.9.0",
  "com.twitter" %% "finatra-http" % "20.9.0" % "test" classifier "tests",
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)