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

        val itemsTitle = intent.getStringExtra("itemsTitle")
        val itemsDescription = intent.getStringExtra("itemsDescription")
        val itemsImages = intent.getIntExtra("itemsImages", 0)
        val itemsCity = intent.getStringExtra("itemsCity")
        val more = intent.getStringExtra("itemsUrl")

        // variabel untuk gambar, judul, dan deskripsi
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



//        // variabel untuk button
//        val marvelMovies = findViewById<Button>(R.id.buttonLink1)
//        marvelMovies.setOnClickListener{
//            val url = "https://www.marvel.com/movies"
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse(url)
//            startActivity(intent)
//        }
//
//        val marvelComics = findViewById<Button>(R.id.buttonLink2)
//        marvelComics.setOnClickListener {
//            val url = "https://www.marvel.com/comics"
//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse(url)
//            startActivity(intent)
//        }
//
        val backButton = findViewById<FloatingActionButton>(R.id.back_Button)
        backButton.setOnClickListener{
            finish()
        }

//        //variabel untuk video
//        val youtubeVideo = findViewById<VideoView>(R.id.videoView)
//        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.youtubevideo)
//        youtubeVideo.setVideoURI(uri)
//        youtubeVideo.setOnCompletionListener {
//            youtubeVideo.start()
//        }
//        youtubeVideo.start()


        titleTextView.text = itemsTitle
        descTextView.text = itemsDescription
        imageView.setImageResource(itemsImages)
        textCity.text = itemsCity
    }
}
