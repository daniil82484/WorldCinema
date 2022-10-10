package com.mob5.LionGames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class RegActivity : AppCompatActivity() {

    lateinit var log: EditText
    lateinit var pass: EditText
    lateinit var email: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        log = findViewById(R.id.editTextTextPersonName2)
        pass = findViewById(R.id.editTextTextPassword2)
        email = findViewById(R.id.editTextTextPersonName3)
    }

    fun login(view: View){
        if (log.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty()){
            val intent = Intent(this@RegActivity,PatchActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


    fun MainActivity(view: View){
        val intent = Intent(this@RegActivity,MainActivity::class.java)
        startActivity(intent)
    }
}