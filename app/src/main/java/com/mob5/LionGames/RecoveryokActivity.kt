package com.mob5.LionGames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecoveryokActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recoveryok)
    }

    fun MainActivity(view: View){
        val intent = Intent(this@RecoveryokActivity,SigninActivity::class.java)
        startActivity(intent)
    }
}