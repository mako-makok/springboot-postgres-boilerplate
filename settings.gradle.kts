pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        includeBuild("plugins")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(
    ":application-root",
    ":flyway",

    ":modules:module-a:api",
    ":modules:module-a:domain",
    ":modules:module-a:infrastructure",
    ":modules:module-a:application",

    ":modules:module-b:api",
    ":modules:module-b:domain",
    ":modules:module-b:infrastructure",
    ":modules:module-b:application",
)
