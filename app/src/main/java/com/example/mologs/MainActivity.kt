package com.example.mologs

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.Window
import android.view.WindowManager

import android.widget.Button
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convert = findViewById<Button>(R.id.button)

        convert.setOnClickListener {
            val intent = Intent(this, ConvertToScreen::class.java)
            startActivity(intent)
        }


    }
}

