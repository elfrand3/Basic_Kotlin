package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.belajarandroid.databinding.ActivityDetailListBinding
import com.example.belajarandroid.databinding.ActivityFragmentbasicBinding

class fragmentbasic : AppCompatActivity() {

    lateinit var binding: ActivityFragmentbasicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentbasicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{
            tempelFragment(FirstFragment())
        }
        binding.button3.setOnClickListener{
            tempelFragment(SecondFragment())
        }
    }

    private fun tempelFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.flFragment, fragment)
        transaction.commit()
    }
}