package com.puput.mymoviesubsatu.ui.main

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.puput.mymoviesubdua.ui.main.MainActivity
import com.puput.mymoviesubsatu.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            Handler(Looper.getMainLooper())
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, EXTRA_TIME)
    }

    companion object {
        private const val EXTRA_TIME: Long = 1500
    }
}