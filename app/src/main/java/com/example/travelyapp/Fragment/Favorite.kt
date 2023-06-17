package com.example.travelyapp.Fragment

import com.example.travelyapp.Adapter.FavoriteAdapter
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelyapp.*
import java.*

/**
 * A simple [Fragment] subclass.
 * Use the [Favorite.newInstance] factory method to
 * create an instance of this fragment.
 */
class Favorite : Fragment() {
    // TODO: Rename and change types of parameters

    private var adapter: RecyclerView.Adapter<FavoriteAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_favorite, container, false)
        val recyclerView : RecyclerView = view.findViewById(R.id.recyclerView1)

        val fadeAnimationIn = AnimationUtils.loadAnimation(context, R.anim.fade_in)
        recyclerView.startAnimation(fadeAnimationIn)

        adapter = FavoriteAdapter()
        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Mail.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Favorite().apply {
                arguments = Bundle().apply {
                }
            }
    }
}