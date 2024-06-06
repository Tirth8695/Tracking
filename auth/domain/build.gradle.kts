plugins {
    alias(libs.plugins.tracking.jvm.library)
}

dependencies{
    implementation(projects.core.domain)
}
