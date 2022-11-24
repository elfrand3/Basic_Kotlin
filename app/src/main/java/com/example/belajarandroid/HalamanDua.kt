package com.example.belajarandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HalamanDua : AppCompatActivity() {
    companion object{
        val NIM_EXTRA = "nim.extra"
        val NAMA_EXTRA = "nama.extra"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_dua)

        val nama = intent.getStringExtra(NAMA_EXTRA)
        val nim = intent.getStringExtra(NIM_EXTRA)
        val txt_nama = findViewById<TextView>(R.id.txt_nama)
        val txt_nim = findViewById<TextView>(R.id.txt_nim)
        txt_nama.text = nama
        txt_nim.text = nim
    }
}