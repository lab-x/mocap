name := "scalaCode"

version := "0.1"

libraryDependencies  ++= Seq(
            // other dependencies here
            "org.scalala" %% "scalala" % "1.0.0.RC3-SNAPSHOT"
)

resolvers ++= Seq(
            // other resolvers here
            "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/",
            "ScalaNLP Maven2" at "http://repo.scalanlp.org/repo"
)

scalaVersion := "2.9.1"