package com.example.honeyapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView


class FarmsAdapter(private val farmslist:ArrayList<Farms>) :
    RecyclerView.Adapter<FarmsAdapter.FarmViewHolder>() {

    class FarmViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView= itemView.findViewById(R.id.farm1_logo)
        val textView: TextView=itemView.findViewById(R.id.farm_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FarmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_order, parent,false)
        return FarmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FarmViewHolder, position: Int) {
       val farms= farmslist[position]
        holder.imageView.setImageResource(farms.image)
        holder.textView.text =farms.name
    }

    override fun getItemCount(): Int {
        return farmslist.size
    }
}