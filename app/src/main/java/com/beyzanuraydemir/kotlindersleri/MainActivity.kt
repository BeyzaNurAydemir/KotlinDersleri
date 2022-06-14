package com.beyzanuraydemir.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { //() varsa-> Kalıtım, yoksa-> interface
    var str1:String? = null
    lateinit var str2:String
    var sayi:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "ababa"
    }
}