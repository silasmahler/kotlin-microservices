package de.silasmahler.aggregatorservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class AggregatorServiceApplication

fun main(args: Array<String>) {
    runApplication<AggregatorServiceApplication>(*args)
}
