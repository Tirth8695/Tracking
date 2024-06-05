plugins {
   `kotlin-dsl`
}

group = "com.tirth.tracking.buildlogic"

dependencies{
   compileOnly(libs.android.gradlePlugin)
   compileOnly(libs.android.tools.common)
   compileOnly(libs.kotlin.gradlePlugin)
   compileOnly(libs.ksp.gradlePlugin)
   compileOnly(libs.room.gradlePlugin)
}

gradlePlugin {
   plugins{
      register("androidApplication"){
         id = "tracking.android.application"
         implementationClass = "AndroidApplicationConventionPlugin"
      }
      register("androidApplicationCompose"){
         id = "tracking.android.application.compose"
         implementationClass = "AndroidApplicationComposeConventionPlugin"
      }
      register("androidLibrary"){
         id = "tracking.android.library"
         implementationClass = "AndroidLibraryConventionPlugin"
      }
      register("androidLibraryCompose"){
         id = "tracking.android.library.compose"
         implementationClass = "AndroidLibraryComposeConventionPlugin"
      }
   }
}