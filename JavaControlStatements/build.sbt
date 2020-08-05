val sbtBuild = SbtBuild("io.logicandcode", "code", "1.0-SNAPSHOT")
  .moduleSourceDirectories()
  .testDependencies(specs_core())

val codeProject = ((project in file("."))).settings( sbtBuild.settings )
