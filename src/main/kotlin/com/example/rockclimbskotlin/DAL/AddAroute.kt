package com.example.rockclimbskotlin.DAL

import com.example.rockclimbskotlin.route
import jakarta.servlet.http.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository


abstract class routerepo : JpaRepository<route, Int> {
    fun addAroute (newRoute: route, request : HttpServletRequest) {
    if (newRoute  != null){
        save(newRoute)
    } else {
       // request.sendError(INTERNAL_SERVER_ERROR.value(), "could not add route") TODO: kotlify this please
    }
    }
}