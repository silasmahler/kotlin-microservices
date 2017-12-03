package de.silasmahler.testservice

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EnableAutoConfiguration
class TestServiceApplication

fun main(args: Array<String>) {
    runApplication<TestServiceApplication>(*args)
}
