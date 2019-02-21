package com.example.kotlinrecyclerviewstarter.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlinrecyclerviewstarter.Model.Language
import com.example.kotlinrecyclerviewstarter.R


class LanguageAdapter(val context: Context, val languages: List<Language>): RecyclerView.Adapter<LanguageAdapter.LanguageHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): LanguageHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.language_item,parent,false)
        return LanguageHolder(view)
    }

    override fun getItemCount(): Int {
        return languages.count()
    }

    override fun onBindViewHolder(holder: LanguageHolder, position: Int) {
        holder.bindTechnology(languages[position],context)
    }

    inner class LanguageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val languageImage = itemView.findViewById<ImageView>(R.id.languageImage)
        val languageTitle = itemView.findViewById<TextView>(R.id.languageText)

        fun bindTechnology(language: Language, context: Context){
            val resourceId = context.resources.getIdentifier(language.image,"drawable",context.packageName)
            languageImage?.setImageResource(resourceId)
            languageTitle?.text = language.title
        }

    }
}