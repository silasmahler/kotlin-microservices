package de.silasmahler.configservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigServiceApplication

fun main(args: Array<String>) {
    runApplication<ConfigServiceApplication>(*args)
}
