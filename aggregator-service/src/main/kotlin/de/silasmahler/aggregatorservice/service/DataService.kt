package de.silasmahler.aggregatorservice.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("test-service")
interface DataService {

    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/test")
    fun getAll(): Array<String>

}