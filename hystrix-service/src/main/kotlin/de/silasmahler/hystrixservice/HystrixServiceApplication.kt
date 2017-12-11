package de.silasmahler.hystrixservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HystrixServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(HystrixServiceApplication::class.java, *args)
}
