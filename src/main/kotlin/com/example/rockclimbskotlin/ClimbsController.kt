package com.example.rockclimbskotlin

import com.example.rockclimbskotlin.DAL.routerepo
import com.example.rockclimbskotlin.model.route
import org.springframework.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClimbsController {


    @GetMapping("/test")
    fun test(): String {
        return "hej med kotlin"
    }

    @GetMapping("/findroute")
    fun findroute(route: route): route {
        return
    }
}