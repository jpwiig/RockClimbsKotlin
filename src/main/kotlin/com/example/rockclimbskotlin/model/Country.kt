package com.example.rockclimbskotlin.model

abstract class country {
    val id: Int = 0
    val name: String = ""
    val continent: String = ""
    val language: String = ""
        get() = field

    class country(id: Int, name: String, continent: String, language: String) {
        val id = id
        val name = name
        val continent = continent
        val language = language
    }

}