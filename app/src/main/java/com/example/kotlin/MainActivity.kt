package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById<TextView>(R.id.counterText)
    }

    fun addCount(view : View) {
        count++
        textView.setText("$count")
    }

    fun resetCount(view : View) {
        count = 0
        textView.setText("$count")
    }
}