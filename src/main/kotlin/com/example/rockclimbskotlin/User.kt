package com.example.rockclimbskotlin

import com.google.crypto.tink.config.TinkConfig
import com.google.crypto.tink.proto.Tink
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.security.crypto.bcrypt.BCrypt

class user {

    @Entity
    //TODO: WHY TF DOES THIS CHRASH THE SERVER?! (table name = "user")
@Table
    class user(id: Int, name: String, email: String, password: String) {
        @Id
        @GeneratedValue
        val id = id
        val name = name
        val email = email
        val password = password
    }

    fun cryptPW(pw: String): String? {
        return BCrypt.hashpw(pw, BCrypt.gensalt())
    }
}