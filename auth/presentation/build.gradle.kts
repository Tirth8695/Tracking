plugins {
    alias(libs.plugins.tracking.android.feature.ui)
}

android {
    namespace = "com.tirth.auth.presentation"
}

dependencies {
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
}