plugins {
    id("kotlin-common-conventions")
    alias(libs.plugins.org.springframework.boot) apply false
}

dependencies {
    implementation(project(":modules:module-a:domain"))
    implementation(libs.bundles.spring.infrastructure.default.implements)

    runtimeOnly("org.postgresql:postgresql")
}
