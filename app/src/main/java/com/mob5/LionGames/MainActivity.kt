package com.mob5.LionGames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun SigninActivity(view: View){
        val intent = Intent(this@MainActivity,SigninActivity::class.java)
        startActivity(intent)
    }

    fun RegActivity (view: View){
        val intent = Intent(this@MainActivity,RegActivity::class.java)
        startActivity(intent)
    }
}
