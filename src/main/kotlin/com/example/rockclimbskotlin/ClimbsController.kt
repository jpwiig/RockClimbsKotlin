package com.example.rockclimbskotlin
import org.springframework.*
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClimbsController {
    @GetMapping("/test")
    fun test():String{
        return "hej med kotlin"
    }

}