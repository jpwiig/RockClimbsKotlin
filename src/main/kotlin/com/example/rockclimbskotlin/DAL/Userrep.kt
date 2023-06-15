package com.example.rockclimbskotlin.DAL

import com.example.rockclimbskotlin.user
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
Abstract class Userrep : JpaRepository<user, Int> {
    fun registerUser(New : user){

    }
    fun regexpUser(tester : user):Boolean{
        val regexpAcc = Regex("^[a-zA-Z0-9]+\$")
        val regexpMail = Regex("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+\$")

        if (regexpAcc.containsMatchIn(teser.name) && regexpMail.containsMatchIn(tester.email)){
            return true
        } else{
            return false
        }
    }
}