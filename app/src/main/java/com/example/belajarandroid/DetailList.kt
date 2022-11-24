package com.example.belajarandroid

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.belajarandroid.adapter.AplikasiAdapter
import com.example.belajarandroid.databinding.ActivityDetailListBinding

class DetailList : AppCompatActivity() {

    private val binding : ActivityDetailListBinding by lazy{
        ActivityDetailListBinding.inflate(layoutInflater)
    }

    private lateinit var aplikasiAdapter : ListApp

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var image = binding.imageView
        var title = binding.textView
        var des = binding.textView2
        var star = binding.textView3

    }
}