package com.example.designpattern_mvp_example

import kotlin.random.Random

class Model {

    var name = ""

    fun randomName(): String {

        when(Random.nextInt(6)){

            0 -> name = "Human"
            1 -> name = "Harry"
            2 -> name = "Stella"
            3 -> name = "Hyun"
            4 -> name = "Lion"
            5 -> name = "Jin"

        }

        return name

    }

}