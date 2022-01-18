package com.example.myarraytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val lostArray = arrayOf(10000, 2300, 45000, 65000,6500, 400) // выложил
    val earnArray = arrayOf(15000, 300, 345000, 5000,16500, 3400) // заработал
    val resultArray = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val names = resources.getStringArray(R.array.names) //достаем из ресурсов массив

        for((index, name) in names.withIndex() ){
            resultArray.add("Name: $name - polychil = ${earnArray[index]-lostArray[index]}")
            Log.v("MyLog", "${resultArray[index]}")
        }

        }
    }
