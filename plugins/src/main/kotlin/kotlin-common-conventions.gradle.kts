import io.gitlab.arturbosch.detekt.extensions.DetektExtension

plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
    id("io.gitlab.arturbosch.detekt")
}

dependencies {
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    testImplementation(kotlin("test"))

    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.1")
}

kotlin {
    jvmToolchain {
        (this).languageVersion.set(JavaLanguageVersion.of(17))
    }
}

detekt {
    autoCorrect = true
}

tasks {
    test {
        useJUnitPlatform()
    }
}
