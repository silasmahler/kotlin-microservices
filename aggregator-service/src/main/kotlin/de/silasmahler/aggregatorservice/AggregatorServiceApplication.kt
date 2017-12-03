package de.silasmahler.aggregatorservice

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@EnableFeignClients
@EnableAutoConfiguration
class AggregatorServiceApplication

fun main(args: Array<String>) {
    runApplication<AggregatorServiceApplication>(*args)
}
