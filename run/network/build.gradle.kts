plugins {
    alias(libs.plugins.tracking.android.library)
    alias(libs.plugins.tracking.jvm.ktor)
}

android {
    namespace = "com.tirth.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}