plugins {
   alias(libs.plugins.tracking.android.library)
}

android {
    namespace = "com.tirth.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)

}