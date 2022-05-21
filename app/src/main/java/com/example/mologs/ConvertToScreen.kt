package com.example.mologs




import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import java.util.*
import kotlin.concurrent.timerTask


class ConvertToScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convert_to_screen)

        val t = findViewById<TextView>(R.id.textView3)
        val rand = (100000..999999).random()
        val hmm = rand.toString()
        t.setText(hmm)
        //checks if verified
        val verified = true
        //launches the display after 4 sec if it is verified
        if(verified==true){
            val intent = Intent(this,Display::class.java)
            val tmstask = timerTask {
                if (verified==true){
                    startActivity(intent)
                    finish()
                }
            }
            val timer = Timer()
            timer.schedule(tmstask,4000)
        }


    }
}