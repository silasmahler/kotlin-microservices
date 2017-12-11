package de.silasmahler.testservice.controller
import de.silasmahler.testservice.service.DataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/test")
class DataController {

    @Autowired
    lateinit var dataService: DataService

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun getAll() = dataService.getAll()

}