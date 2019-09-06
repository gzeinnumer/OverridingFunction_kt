package com.gzeinnumer.overridingfunctionkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val perempuan = Prempuan()
        perempuan.displayAge(31)
    }
}

open class Person{
    open fun displayAge(age: Int){
        println("Umur $age")
    }
}

class Prempuan:Person(){
    override fun displayAge(age: Int) {
        super.displayAge(5)

        println("Umur Palsu = ${age-5}")
    }
}