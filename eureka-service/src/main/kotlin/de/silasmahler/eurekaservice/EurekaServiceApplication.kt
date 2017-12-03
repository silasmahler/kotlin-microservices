package de.silasmahler.eurekaservice

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration
class EurekaServiceApplication

fun main(args: Array<String>) {
    runApplication<EurekaServiceApplication>(*args)
}
