package de.silasmahler.hystrixservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
@EnableAutoConfiguration
class HystrixServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(HystrixServiceApplication::class.java, *args)
}
