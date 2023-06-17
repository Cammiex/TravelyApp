package com.example.travelyapp.Fragment

import com.example.travelyapp.Adapter.Adapter
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelyapp.R
import java.*
/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {
    // TODO: Rename and change types of parameters

    private var adapter: RecyclerView.Adapter<Adapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView : RecyclerView = view.findViewById(R.id.recyclerView)

        val fadeAnimationIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        recyclerView.startAnimation(fadeAnimationIn)

        val desert =  view.findViewById<ImageView>(R.id.imageView6)
        desert.setOnClickListener{
            val url ="https://www.originaltravel.co.uk/travel-blog/top-12-most-beautiful-deserts-in-the-world"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val sea = view.findViewById<ImageView>(R.id.imageView4)
        sea.setOnClickListener{
            val url ="https://www.travelandleisure.com/trip-ideas/beach-vacations/most-beautiful-beaches-in-the-world"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val city = view.findViewById<ImageView>(R.id.imageView5)
        city.setOnClickListener {
            val url ="https://www.veranda.com/travel/g37779254/most-beautiful-cities-in-the-world/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val hill = view.findViewById<ImageView>(R.id.imageView2)
        hill.setOnClickListener {
            val url ="https://www.newsnetnow.com/top-10-most-beautiful-hill-stations-in-the-world/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }

        val images = listOf(sea, desert, city, hill)
        images.forEach { imageView ->
            imageView.startAnimation(fadeAnimationIn)
        }


        adapter = Adapter()
        recyclerView.adapter = adapter

        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                }
            }
    }
}