plugins {
    id("kotlin-common-conventions")
}

dependencies {
    implementation(libs.bundles.spring.application.default.implements)
    implementation(project(":modules:module-b:domain"))
}
