package de.silasmahler.testservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@SpringBootApplication
@EnableDiscoveryClient
class TestServiceApplication

fun main(args: Array<String>) {
    runApplication<TestServiceApplication>(*args)
}

data class Greeting(val id: Long, val content: String)

@RestController
class GreetingsController {
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value= "name", defaultValue = "World")
                 name: String)
    = Greeting(counter.incrementAndGet(), "Hello, $name")

}