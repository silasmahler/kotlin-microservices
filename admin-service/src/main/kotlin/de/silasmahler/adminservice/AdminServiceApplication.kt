package de.silasmahler.adminservice

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@Configuration
@EnableAdminServer
class AdminServiceApplication

fun main(args: Array<String>) {
    runApplication<AdminServiceApplication>(*args)
}
