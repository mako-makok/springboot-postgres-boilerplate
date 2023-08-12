plugins {
    id("kotlin-common-conventions")
}

dependencies {
    implementation(project(":modules:module-b:application"))
    implementation(libs.bundles.spring.api.default.implements)
}
