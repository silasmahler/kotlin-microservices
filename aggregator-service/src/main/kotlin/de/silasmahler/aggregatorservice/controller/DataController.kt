package de.silasmahler.controller

import de.silasmahler.aggregatorservice.service.DataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/test")
class DataController {

    @Autowired
    lateinit var dataService: DataService

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun getAll(): String {
        return dataService.getAll().reduce { s1, s2 -> "$s1 $s2" }
    }

}