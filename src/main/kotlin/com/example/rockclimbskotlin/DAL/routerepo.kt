package com.example.rockclimbskotlin.DAL

import com.example.rockclimbskotlin.model.route
import jakarta.servlet.http.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository


abstract class routerepo : JpaRepository<route, Int> {
    fun addAroute(newRoute: route, request: HttpServletRequest) {
        if (newRoute != null) {
            save(newRoute)
        } else {
            // request.sendError(INTERNAL_SERVER_ERROR.value(), "could not add route") TODO: kotlify this please
        }
    }

    fun findroute(name: String): route {
        val allroutes: List<route> = findAll()
        for (route in allroutes) {
            if (route.name == name) {
                return route
            } else {
                //request.sendError(INTERNAL_SERVER_ERROR.value(), "could not find route") TODO: kotlify this please
            }
        }
        throw Exception("could not find route")
    }
}