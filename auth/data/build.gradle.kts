plugins {
    alias(libs.plugins.tracking.android.library)
    alias(libs.plugins.tracking.jvm.ktor)
}

android {
    namespace = "com.tirth.auth.data"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.auth.data)

}