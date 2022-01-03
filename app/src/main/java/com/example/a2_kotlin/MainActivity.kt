package com.example.a2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val value2 = savedInstanceState?.getByte("byteKey")

        val value = savedInstanceState!!["valueKey"]
    }
}