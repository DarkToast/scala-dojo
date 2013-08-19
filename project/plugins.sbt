// Comment to get more information during initialization
logLevel := Level.Warn

// intellj integration
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

// eclipse integration
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

// dependency graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")
