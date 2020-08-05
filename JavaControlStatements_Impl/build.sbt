
val sbtBuild = SbtBuild("io.logicandcode", "impl", "1.0-SNAPSHOT")
  .moduleSourceDirectories()
  .moduleDependencies(specs_core())

val codeModule = ProjectRef( uri("../JavaControlStatements"), "codeProject")

val codeImplProject = ((project in file(".")))
  .settings( sbtBuild.settings )
  .dependsOn( codeModule )
