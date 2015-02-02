name := "scalaWSDL"

organization  := "com.valiha"

version       := "0.1"

scalaVersion  := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  Seq(
  )
}

libraryDependencies ++= {
  Seq(
    "org.specs2" %% "specs2" % "2.4" % "test",
    "org.scalatest" %% "scalatest" % "2.2.1" % "test",
    "junit" % "junit" % "4.10" % "test"
  )
}

