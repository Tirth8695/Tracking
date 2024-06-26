plugins {
    alias(libs.plugins.tracking.android.feature.ui)
}

android {
    namespace = "com.tirth.run.presentation"
}

dependencies {

    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.run.domain)
}