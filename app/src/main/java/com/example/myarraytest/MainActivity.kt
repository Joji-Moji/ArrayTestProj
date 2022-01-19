package com.example.myarraytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    // сортировка учеников по успеваемости

    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         for ((index, grade) in gradeArray.withIndex()){
             when (grade){
                 in bad -> {badArray.add("Ученик: ${nameArray[index]} – $grade")}
                 in normal -> {normalArray.add("Ученик: ${nameArray[index]} – $grade")}
                 in nice -> {niceArray.add("Ученик: ${nameArray[index]} – $grade")}
                 excellent -> {excellentArray.add("Ученик: ${nameArray[index]} – $grade")}
                }

            }
        badArray.forEach{Log.d("MyLog", it)}
        normalArray.forEach{Log.d("MyLog", it)}
        niceArray.forEach{Log.d("MyLog", it)}
        excellentArray.forEach{Log.d("MyLog", it)}
        }
    }
