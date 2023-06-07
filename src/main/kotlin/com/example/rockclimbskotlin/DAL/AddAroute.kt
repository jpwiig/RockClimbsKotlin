package com.example.rockclimbskotlin.DAL

import com.example.rockclimbskotlin.route
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository


abstract class routerepo : JpaRepository<route, Int> {
    fun addAroute (newRoute: route){
    if (newRoute  != null){
        save(newRoute)
    }
    }
}