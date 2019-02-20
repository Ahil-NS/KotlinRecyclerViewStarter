package com.example.kotlinrecyclerviewstarter.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlinrecyclerviewstarter.Model.Technology
import com.example.kotlinrecyclerviewstarter.R
import kotlinx.android.synthetic.main.technology_item.view.*

class TechnologyRecycleAdapter(val context: Context, val technologies: List<Technology>): RecyclerView.Adapter<TechnologyRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.technology_item,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return technologies.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bindTechnology(technologies[position],context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val technologyImage = itemView.findViewById<ImageView>(R.id.technologyImage)
        val technologyTitle = itemView.findViewById<TextView>(R.id.technologyName)

        fun bindTechnology(technology: Technology, context: Context){

            val resourceId = context.resources.getIdentifier(technology.image,"drawable",context.packageName)
            technologyImage?.setImageResource(resourceId)

            technologyTitle?.text = technology.title
        }

    }
}