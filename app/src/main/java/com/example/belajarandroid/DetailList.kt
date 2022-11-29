package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_list)
        
        val image: ImageView = findViewById(R.id.imageView)
        val nama : TextView = findViewById(R.id.textView)
        val des : TextView = findViewById(R.id.textView2)
        
        val bundle: Bundle? = intent.extras
        val img = bundle!!.getInt("image")
        val nm = bundle.getString("nama")
        val ds = bundle.getString("des")
        
        image.setImageResource(img)
        nama.text = nm
        des.text = ds
    }
}