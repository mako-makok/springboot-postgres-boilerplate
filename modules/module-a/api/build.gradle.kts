plugins {
    id("kotlin-common-conventions")
}

dependencies {
    implementation(libs.bundles.spring.api.default.implements)
    implementation(project(":modules:module-a:application"))
}
