package com.example.belajarandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarandroid.adapter.AplikasiAdapter
import com.example.belajarandroid.databinding.ActivityListAppBinding
import com.example.belajarandroid.databinding.ActivityMainBinding
import com.example.belajarandroid.model.DataAplikasi

class ListApp : AppCompatActivity() {

    private val binding: ActivityListAppBinding by lazy {
        ActivityListAppBinding.inflate(layoutInflater)
    }

    private lateinit var aplikasiAdapter: AplikasiAdapter

    private val dataDummy = arrayListOf(
        DataAplikasi(
            R.drawable.unuja,
            "Faktek",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.facebook,
            "facebook",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.google,
            "google",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
        DataAplikasi(
            R.drawable.tweet,
            "tweet",
            "Lorem ipsum, atau ringkasnya lipsum, adalah teks standar yang ditempatkan untuk mendemostrasikan elemen grafis atau presentasi visual seperti font, tipografi, dan tata letak",
            4.8),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        aplikasiAdapter = AplikasiAdapter(this)
        binding.rvList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ListApp)
            adapter = aplikasiAdapter
        }
        aplikasiAdapter.setData(dataDummy)
    }
}