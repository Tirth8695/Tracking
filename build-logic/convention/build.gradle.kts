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
      register("androidFeatureUi"){
         id = "tracking.android.feature.ui"
         implementationClass = "AndroidFeatureUiConventionPlugin"
      }
      register("androidRoom"){
         id = "tracking.android.room"
         implementationClass = "AndroidRoomConventionPlugin"
      }
      register("jvmLibrary"){
         id = "tracking.jvm.library"
         implementationClass = "JvmLibraryConventionPlugin"
      }
      register("jvmKtor"){
         id = "tracking.jvm.ktor"
         implementationClass = "JvmKtorConventionPlugin"
      }
   }
}