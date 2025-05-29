package com.rajdeep.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(val datalist : ArrayList<DataClass>) : RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(
        holder: ViewHolderClass,
        position: Int
    ) {
        val currentItem = datalist[position]
        holder.rv_image.setImageResource(currentItem.image)
        holder.rv_text.text = currentItem.text

    }

    override fun getItemCount(): Int {
        return datalist.size
    }


    class ViewHolderClass(itemView : View) : RecyclerView.ViewHolder(itemView){
        val rv_image = itemView.findViewById<ImageView>(R.id.rv_image)
        val rv_text = itemView.findViewById<TextView>(R.id.rv_text)

    }
}