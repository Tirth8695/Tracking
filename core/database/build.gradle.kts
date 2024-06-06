plugins {
    alias(libs.plugins.tracking.android.library)
    alias(libs.plugins.tracking.android.room)
}

android {
    namespace = "com.tirth.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)
}