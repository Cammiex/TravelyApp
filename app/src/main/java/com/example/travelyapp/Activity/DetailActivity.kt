package com.example.travelyapp.Activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.travelyapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // variabel untuk gambar, judul, deskripsi, dan link pada button
        val itemsTitle = intent.getStringExtra("itemsTitle")
        val itemsDescription = intent.getStringExtra("itemsDescription")
        val itemsImages = intent.getIntExtra("itemsImages", 0)
        val itemsCity = intent.getStringExtra("itemsCity")
        val more = intent.getStringExtra("itemsUrl")

        // variabel binding untuk gambar, judul, deskripsi, dan link pada button
        val titleTextView: TextView = findViewById(R.id.titleTextView)
        val descTextView: TextView = findViewById(R.id.descTextView)
        val imageView: ImageView = findViewById(R.id.imageHeader)
        val textCity: TextView = findViewById(R.id.textCity)
        val textUrl = findViewById<Button>(R.id.button)

        textUrl.setOnClickListener {
            val url = more
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val backButton = findViewById<FloatingActionButton>(R.id.back_Button)
        backButton.setOnClickListener{
            finish()
        }

        titleTextView.text = itemsTitle
        descTextView.text = itemsDescription
        imageView.setImageResource(itemsImages)
        textCity.text = itemsCity
    }
}
