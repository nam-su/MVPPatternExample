package com.example.designpattern_mvp_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var presenter: Presenter

    lateinit var textView: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        // 프레젠터 객체 초기화
        presenter = Presenter()

        button.setOnClickListener {

            // presenter의 result 메서드 호출 후 반환값을 textView의 text로 초기화 해준다.
            textView.text = presenter.result()

        }

    }

}