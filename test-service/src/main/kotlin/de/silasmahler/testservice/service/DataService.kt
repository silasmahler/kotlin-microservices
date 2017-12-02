package de.silasmahler.testservice.service

import org.springframework.stereotype.Service

@Service
class DataService {

    fun getAll(): Array<String> {
        println("call")
        return arrayOf("Hello", "from", "spring", "service", "now", System.currentTimeMillis().toString())
    }

}