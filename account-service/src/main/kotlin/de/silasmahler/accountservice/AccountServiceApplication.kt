package de.silasmahler.accountservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class AccountServiceApplication

fun main(args: Array<String>) {
    runApplication<AccountServiceApplication>(*args)
}
