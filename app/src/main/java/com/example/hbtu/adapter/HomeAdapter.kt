package com.example.hbtu.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hbtu.DetailActivity
import com.example.hbtu.HomeActivity
import com.example.hbtu.HomeSource
import com.example.hbtu.R
import com.google.android.play.integrity.internal.f

class HomeAdapter(
    private val context: Context?
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>(){

    val data = HomeSource.homeDP
    class HomeViewHolder(view: View?):RecyclerView.ViewHolder(view!!){
        var imageDp:TextView = view!!.findViewById(R.id.displayText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_item,parent, false)
        return HomeViewHolder(view)
    }

    override fun getItemCount(): Int  = data.size

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = data[position]
        holder.imageDp.text = item.imageresourceid
        val resources = context?.resources
        holder.itemView.setOnClickListener{
            val intent = Intent(context,DetailActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.putExtra("URL",item.url)
            context?.startActivity(intent)
        }
    }
}