package com.example.kotlinrecyclerviewstarter.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.kotlinrecyclerviewstarter.Adapters.LanguageAdapter
import com.example.kotlinrecyclerviewstarter.Adapters.TechnologyRecycleAdapter

import com.example.kotlinrecyclerviewstarter.R
import com.example.kotlinrecyclerviewstarter.Services.DataService
import com.example.kotlinrecyclerviewstarter.Utils.EXTRA_TECH
import kotlinx.android.synthetic.main.activity_language.*
import kotlinx.android.synthetic.main.activity_main.*

class LanguageActivity : AppCompatActivity() {

    lateinit var adapter: LanguageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val techPass = intent.extras.getString(EXTRA_TECH)

        adapter = LanguageAdapter(this, DataService.getLanguage(techPass))
        languageRecycleView.adapter = adapter

        var layoutManager = GridLayoutManager(this,2)
        languageRecycleView.layoutManager = layoutManager


    }
}
