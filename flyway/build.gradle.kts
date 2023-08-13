plugins {
    java
    alias(libs.plugins.flyway)
}

dependencies {
    implementation(libs.flyway.core)
    runtimeOnly(libs.org.postgresql.postgresql)
}

flyway {
    driver = "org.postgresql.Driver"
    url = "jdbc:postgresql://localhost:5432/example"
    user = "postgres"
    password = "postgres"
    schemas = arrayOf("public")
    cleanDisabled = false
}
