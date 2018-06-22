package com.raywenderlich.android.rwandroidtutorial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val intent = Intent(this, MainActivity::class.java)
    startActivity(intent)
    finish()
  }
}
