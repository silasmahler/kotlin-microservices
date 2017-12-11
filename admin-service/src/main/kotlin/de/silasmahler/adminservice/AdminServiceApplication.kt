package de.silasmahler.adminservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
class AdminServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdminServiceApplication::class.java, *args)
}
