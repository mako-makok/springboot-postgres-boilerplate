package com.example.applicationroot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com"])
@ConfigurationPropertiesScan
class ApiApplication

fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<ApiApplication>(*args)
}
