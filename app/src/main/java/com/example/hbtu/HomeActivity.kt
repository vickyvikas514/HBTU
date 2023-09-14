package com.example.hbtu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hbtu.adapter.HomeAdapter
import com.example.hbtu.databinding.ActivityHomeBinding
import com.example.hbtu.databinding.HomeItemBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.RecyclerView.adapter = HomeAdapter(
            applicationContext
        )
        binding.RecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}