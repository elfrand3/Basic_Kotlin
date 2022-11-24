package com.example.belajarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registasi)

        val simpan = findViewById<Button>(R.id.button)
        simpan.setOnClickListener{startActivity(Intent(this@Registasi, MainActivity::class.java))}
    }
}