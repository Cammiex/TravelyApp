package com.example.travelyapp.Activity

import com.example.travelyapp.Fragment.Favorite
import com.example.travelyapp.Fragment.Home
import com.example.travelyapp.Fragment.Profile
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.travelyapp.R
import com.example.travelyapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(Home())
                R.id.favorite -> replaceFragment(Favorite())
                R.id.profile -> replaceFragment(Profile())

                else ->{

                }
            }
            true

        }
    }

    private fun replaceFragment(fragment: Fragment){

    val fragmentManager = supportFragmentManager
    val fragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction.replace(R.id.frame_layout, fragment)
    fragmentTransaction.commit()
    }
}