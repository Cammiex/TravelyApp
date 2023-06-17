package com.example.travelyapp.Activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.travelyapp.R

class SplashActivity : AppCompatActivity() {

    private val splashTimeOut: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val logoView = findViewById<ImageView>(R.id.imageView7)
        val fadeAnimationIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        logoView.startAnimation(fadeAnimationIn)

        Handler().postDelayed({
            // Kode ini akan dijalankan setelah waktu penundaan selesai
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashTimeOut)
    }
}