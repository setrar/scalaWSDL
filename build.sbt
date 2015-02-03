name := "scalaWSDL"

organization  := "com.valiha"

version       := "0.1"

scalaVersion  := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val dispatchV = "0.11.2" // change this to appropriate dispatch version
  Seq(
     "org.scala-lang.modules"  %% "scala-xml"                % "1.0.2",
     "org.scala-lang.modules"  %% "scala-parser-combinators" % "1.0.1",
     "net.databinder.dispatch" %% "dispatch-core" % dispatchV
  )
}

libraryDependencies ++= {
  val specs2V = "2.4"
  Seq(
    "org.specs2"    %% "specs2"    % specs2V % "test",
    "org.scalatest" %% "scalatest" % "2.2.1" % "test",
    "junit"          % "junit"     % "4.10"  % "test"
  )
}

