package com.example.rockclimbskotlin.DAL

import com.example.rockclimbskotlin.model.user
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
abstract class Userrep : JpaRepository<user, Int> {
    fun registerUser(NewUser: user) {
        if (regexpUser(NewUser)) save(NewUser)
        else throw Exception("could not register user")

    }

    fun regexpUser(tester: user): Boolean {
        val regexpAcc = Regex("^[a-zA-Z0-9]+\$")
        val regexpMail = Regex("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+\$")

        val name: String = tester.name
        val email: String = tester.email

        if (regexpAcc.containsMatchIn(name) && regexpMail.containsMatchIn(email)){
            return true
        }
        else {
            return false
        }
    }
}