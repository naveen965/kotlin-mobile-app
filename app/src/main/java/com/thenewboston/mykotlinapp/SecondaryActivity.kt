package com.thenewboston.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        button3.setOnClickListener{
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
