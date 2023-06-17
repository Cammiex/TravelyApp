package com.example.travelyapp.Adapter

import com.example.travelyapp.Activity.DetailActivity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelyapp.Data.items
import com.example.travelyapp.R
import com.example.travelyapp.Data.items

class FavoriteAdapter  : RecyclerView.Adapter<FavoriteAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textTitle: TextView = itemView.findViewById(R.id.textTitle)
//        val textDesc: TextView = itemView.findViewById(R.id.textDesc)
        val imageContent: ImageView = itemView.findViewById(R.id.imageContent)
//        val textCity: TextView = itemView.findViewById(R.id.textCity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.favorite_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = items[position]
        holder.textTitle.text = currentItem.itemsTitle
//        holder.textDesc.text = currentItem.itemsCity
        holder.imageContent.setImageResource(currentItem.itemsImages)
//        holder.textCity.text = currentItem.itemsCity

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("itemsTitle", currentItem.itemsTitle)
            intent.putExtra("itemsDescription", currentItem.itemsDescription)
            intent.putExtra("itemsImages", currentItem.itemsImages)
            intent.putExtra("itemsCity", currentItem.itemsCity)
            intent.putExtra("itemsUrl", currentItem.itemsUrl)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}