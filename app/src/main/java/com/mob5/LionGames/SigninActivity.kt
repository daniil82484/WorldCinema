package com.mob5.LionGames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SigninActivity : AppCompatActivity() {

    lateinit var log:EditText
    lateinit var pass:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        log = findViewById(R.id.editTextTextPersonName)
        pass = findViewById(R.id.editTextTextPassword)
    }

    fun login(view: View){
        if (log.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty() ){
            val intent = Intent(this@SigninActivity,PatchActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun RecoveryActivity (view: View){
        val intent = Intent(this@SigninActivity,RecoveryActivity::class.java)
        startActivity(intent)
    }
}