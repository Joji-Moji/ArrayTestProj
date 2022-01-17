package com.example.myarraytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbers = arrayOf(3,2,5,6)
        Log.v("MyLog", "Number ${numbers.contentToString()}")
        numbers.sort()
        Log.v("MyLog", "Number ${numbers.contentToString()}")
    }
}