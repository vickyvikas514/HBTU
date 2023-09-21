package com.example.hbtu.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hbtu.DepartmentActivity
import com.example.hbtu.DetailActivity
import com.example.hbtu.HomeSource
import com.example.hbtu.R

class DepartmentAdapter(
    private val context: Context?
) : RecyclerView.Adapter<DepartmentAdapter.HomeViewHolder>(){

    val data = HomeSource.Department
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

                val intent = Intent(android.content.Intent.ACTION_VIEW)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                 intent.data = Uri.parse(item.url)
                context?.startActivity(intent)


        }
    }
}