package com.example.a2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.test_button)

        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Tested", Toast.LENGTH_SHORT).show()
        }
    }

}