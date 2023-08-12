plugins {
    id("kotlin-common-conventions")
    alias(libs.plugins.org.springframework.boot) apply false
    alias(libs.plugins.io.spring.dependency.management)
}

dependencies {
    implementation(project(":modules:module-b:domain"))
    implementation(libs.bundles.spring.infrastructure.default.implements)
    runtimeOnly("org.postgresql:postgresql")
}
