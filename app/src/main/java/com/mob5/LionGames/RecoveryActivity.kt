package com.mob5.LionGames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)
    }

    fun RecoveryokActivity(view: View){
        val intent = Intent(this@RecoveryActivity,RecoveryokActivity::class.java)
        startActivity(intent)
    }

    fun SigninActivity (view: View){
        val intent = Intent(this@RecoveryActivity,SigninActivity::class.java)
        startActivity(intent)
    }
}