package com.example.uikotlinpractice_present

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uikotlinpractice_present.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)

//        확인버튼이 눌리면? 이벤트 달아주자.

        binding.okBtn.setOnClickListener {

//            입력된 내용? : content 의 text 의 값 조회 (get) 변수에 저장해두자.

        val inputContent = binding.contentEdt.text.toString()

        binding.resultTxt.text = inputContent

        }

    }
}