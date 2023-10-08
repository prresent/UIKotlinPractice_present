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
        binding.contentEdt

        binding.okBtn

        binding.reslutTxt


    }
}