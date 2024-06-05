plugins {
    alias(libs.plugins.tracking.android.library)
}

android {
    namespace = "com.tirth.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}