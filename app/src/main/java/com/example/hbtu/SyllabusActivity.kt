package com.example.hbtu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hbtu.adapter.HomeAdapter
import com.example.hbtu.adapter.SyllabusAdapter
import com.example.hbtu.databinding.ActivityHomeBinding
import com.example.hbtu.databinding.ActivitySyllabusBinding

class SyllabusActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySyllabusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySyllabusBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.RecyclerView.adapter = SyllabusAdapter(
            applicationContext
        )
        binding.RecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}