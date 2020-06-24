name := """play-sample-project"""
organization := "muralis hub"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.23.4" % Test
//
//import com.typesafe.sbt.packager.docker.DockerChmodType
//dockerChmodType := DockerChmodType.UserGroupWriteExecute

javaOptions in Universal ++= Seq(
  "-Dpidfile.path=/dev/null"
)

// for docker it uses jre instead of jdk which makes it light weight
dockerBaseImage       := "openjdk:jre"