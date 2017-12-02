package de.silasmahler.aggregatorservice.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient("data-service")
interface DataService {

    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/data")
    fun getAll(): Array<String>

}