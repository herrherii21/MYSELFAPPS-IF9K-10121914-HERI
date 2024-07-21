package com.example.myselfapps_if9k_10121914_heri

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.myselfapps_if9k_10121914_heri.MainActivity
import com.example.myselfapps_if9k_10121914_heri.R

class SplashActivity : AppCompatActivity() {
    private val splashTimeOut: Long = 2000 // Durasi tampilan Splash Screen

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        // Handler untuk menangani tampilan Splash Screen selama beberapa waktu
        Handler().postDelayed({
            // Setelah waktu tertentu, navigasikan ke MainActivity
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            // Hentikan Activity saat ini
            finish()
        }, splashTimeOut)
    }
}
