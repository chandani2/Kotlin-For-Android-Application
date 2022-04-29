package com.cris.birthdaymessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val age = 5 * 365
    val name = "Chandani Kumari"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //here i am calling function
        //here i am calling function
        birthdayMessage()

    }

    fun birthdayMessage(){
        println("Happy Birthday, ${name}")

        //Let's print a cake!
        println("    '''''    ")
        println("    |||||    ")
        println("   ========   ")
        println("  @@@@@@@@@@@  ")
        println(" { ~@~@~@~@~@~ } ")
        println("@@@@@@@@@@@@@@@@@")

        // This print an empty line
        print("")
        println("You are allready ${age} days old ${name}!")
        println("${age} day old is the very best age to celebrate!")
    }
}