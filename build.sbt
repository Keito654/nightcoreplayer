ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "jp.ed.nnn"
ThisBuild / scalaVersion := "2.13.8"

val osName: SettingKey[String] = SettingKey[String]("osName")

osName := (System.getProperty("os.name") match {
  case name if name.startsWith("Linux") => "linux"
  case name if name.startsWith("Mac") => "mac"
  case name if name.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
})

libraryDependencies += "org.openjfx" % "javafx-base" % "17.0.2" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-controls" % "17.0.2" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-fxml" % "17.0.2" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-graphics" % "17.0.2" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-web" % "17.0.2" classifier osName.value
libraryDependencies += "org.openjfx" % "javafx-media" % "17.0.2" classifier osName.value
