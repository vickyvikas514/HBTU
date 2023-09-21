package com.example.hbtu

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hbtu.databinding.ActivityDetailBinding
import com.github.barteksc.pdfviewer.PDFView
import java.net.URI
import java.net.URL


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)
        //yaha link daalna hai
        val url = intent.getStringExtra("URL")
        if(url!=null){
            val PdfView : PDFView = binding.PdfView
           // val myUri = Uri.parse(url)
            PdfView.fromAsset(url).load()
        }
    }
}