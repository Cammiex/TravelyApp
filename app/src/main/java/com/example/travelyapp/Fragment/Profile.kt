package com.example.travelyapp.Fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import com.example.travelyapp.R
import com.google.android.material.switchmaterial.SwitchMaterial

/**
 * A simple [Fragment] subclass.
 * Use the [Profile.newInstance] factory method to
 * create an instance of this fragment.
 */
class Profile : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val cardView = view.findViewById<CardView>(R.id.cardProfile)
        val cardView2 = view.findViewById<CardView>(R.id.cardProfile2)
        val textDesc = view.findViewById<TextView>(R.id.textView11)
        val textTitle = view.findViewById<TextView>(R.id.textView10)
        val imageView = view.findViewById<ImageView>(R.id.imageView3)
        val fadeAnimationIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        val instagram =  view.findViewById<ImageView>(R.id.instagram)

        val content = listOf(textDesc, textTitle, imageView, instagram, cardView, cardView2)
        content.forEach {content ->

        content.startAnimation(fadeAnimationIn)

        }


        instagram.setOnClickListener{
            val url ="https://instagram.com/aqilraa_?igshid=MzNlNGNkZWQ4Mg=="
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Profile.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Profile().apply {
                arguments = Bundle().apply {
                }
            }
    }
}