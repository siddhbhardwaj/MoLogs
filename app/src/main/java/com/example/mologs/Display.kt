package com.example.mologs


import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import android.net.Uri
import android.view.View
import android.widget.MediaController

class Display : AppCompatActivity() {
    override fun onStart(){
        super.onStart()
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
    }
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
        supportActionBar?.hide()
        startLockTask()
        var url = "https://firebasestorage.googleapis.com/v0/b/mologs.appspot.com/o/moss_-_27198%20(Original).mp4?alt=media&token=ca345b9c-2663-48e7-aa87-4fd207f0dd64"
        val videoview = findViewById<VideoView>(R.id.videoView)
        val uri = Uri.parse(url)
        videoview.setVideoURI(uri)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoview)
        mediaController.setMediaPlayer(videoview)
        videoview.start()



    }

}