plugins {
    java
    alias(libs.plugins.flyway)
}

dependencies {
    implementation(libs.flyway.core)
    runtimeOnly("org.postgresql:postgresql:42.6.0")
}

flyway {
    driver = "org.postgresql.Driver"
    url = "jdbc:postgresql://localhost:5432/example"
    user = "postgres"
    password = "postgres"
    schemas = arrayOf("public")
    cleanDisabled = false
}
