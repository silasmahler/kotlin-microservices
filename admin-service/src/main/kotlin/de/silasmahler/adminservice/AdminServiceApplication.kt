package de.silasmahler.adminservice

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableAdminServer
class AdminServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(AdminServiceApplication::class.java, *args)
}
