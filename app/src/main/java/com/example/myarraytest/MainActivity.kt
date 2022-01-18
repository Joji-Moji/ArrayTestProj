package com.example.myarraytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var index = 1000
        Log.v("MyLog", "1000 - 7")
        while (index>7){
            index -= 7

            Log.v("MyLog", "$index - 7")

        }
    }
}