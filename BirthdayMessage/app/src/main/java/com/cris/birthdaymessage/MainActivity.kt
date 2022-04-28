package com.cris.birthdaymessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        birthdayMessage()
    }

    fun birthdayMessage(){
        println("Happy Birthday, Chandani")

        //Let's print a cake!
        println("    '''''    ")
        println("    |||||    ")
        println("   ========   ")
        println("  @@@@@@@@@@@  ")
        println(" { ~@~@~@~@~@~ } ")
        println("@@@@@@@@@@@@@@@@@")

        // This print an empty line
        print("")
        println("You are allready 26!")
        println("26 is the very best age to celebrate!")
    }
}