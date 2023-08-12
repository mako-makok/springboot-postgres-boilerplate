plugins {
    id("kotlin-common-conventions")
    alias(libs.plugins.org.springframework.boot)
    alias(libs.plugins.io.spring.dependency.management)
}

dependencies {
    implementation(libs.spring.boot.starter)
    implementation(project(":modules:module-a:api"))
    runtimeOnly(project(":modules:module-a:infrastructure"))

    implementation(project(":modules:module-b:api"))
    runtimeOnly(project(":modules:module-b:infrastructure"))
}
