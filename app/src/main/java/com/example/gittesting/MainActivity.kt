package com.example.gittesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello, first commit")
        println("Student")
        println("Hello from your friend :) ")
        println("fifth commit")
    }
}