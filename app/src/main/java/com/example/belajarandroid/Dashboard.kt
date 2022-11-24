package com.example.belajarandroid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


//pembelajaran IntentExplicit & IntentImplicit

class Dashboard : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val back = findViewById<Button>(R.id.back)
        val btnkirim = findViewById<Button>(R.id.btnkirim)

        back.setOnClickListener(this)
        btnkirim.setOnClickListener(this)
    }

//    IntentExplicit
    override fun onClick(p0: View?) {
        when (p0?.id){
            R.id.back -> {
                val back = Intent(this, MainActivity::class.java)
                startActivity(back)
            }
            R.id.btnkirim -> {
                val btnKirim = findViewById<EditText>(R.id.edtnama)
                var nama = btnKirim.text.toString()
                val btnkirim = Intent(this, HalamanDua::class.java)
                btnkirim.putExtra(HalamanDua.NAMA_EXTRA, nama)
                val Kirim = findViewById<EditText>(R.id.edtnim)
                var nim = Kirim.text.toString()
                btnkirim.putExtra(HalamanDua.NIM_EXTRA, nim)
                startActivity(btnkirim)
            }
        }
    }
}