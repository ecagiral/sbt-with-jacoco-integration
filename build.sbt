ThisBuild / organization := "com.ecagiral"
lazy val hello = taskKey[Unit]("An example task")
ThisBuild / hello := { println("Hello!") }

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .enablePlugins(JacocoItPlugin)
  .settings(javaSource in IntegrationTest := baseDirectory.value / "it")
  .settings(
    name := "SBT Test",
    libraryDependencies ++= Seq(
	  "junit" % "junit" % "4.12" % Test,
	  "junit" % "junit" % "4.12" % IntegrationTest,
	  "com.novocode" % "junit-interface" % "0.11" % Test,	
	  "com.novocode" % "junit-interface" % "0.11" % IntegrationTest	
	)
  )

 testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-q", "-a")