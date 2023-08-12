import Build_gradle.VERSIONS.DETEKT_VERSION
import Build_gradle.VERSIONS.KOTLIN_VERSION

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

object VERSIONS {
    const val KOTLIN_VERSION = "1.9.0"
    const val DETEKT_VERSION = "1.23.1"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION")
    implementation("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin:$KOTLIN_VERSION")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$DETEKT_VERSION")
}
