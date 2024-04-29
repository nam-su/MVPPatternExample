package com.example.designpattern_mvp_example

class Presenter {

    // model 객체를 초기화
    private val model = Model()

    // result 메서드를 통해 model.randomName()의 반환값을 반환 해준다.
    fun result(): String {

        return model.randomName()

    }

}