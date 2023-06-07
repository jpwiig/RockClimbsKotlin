package com.example.rockclimbskotlin

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table


class route {

    @Entity
    @Table(name = "route")
  class route (id: Int, name : String, grade: String, location :  String ){
      @Id
      @GeneratedValue
      val id = id
      val name = name
      val grade = grade

  }

}