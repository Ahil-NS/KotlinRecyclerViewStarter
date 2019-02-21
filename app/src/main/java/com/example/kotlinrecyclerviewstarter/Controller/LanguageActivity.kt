package com.example.kotlinrecyclerviewstarter.Controller

import android.content.Intent
import android.content.res.Configuration
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

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 3
        }

        var layoutManager = GridLayoutManager(this,spanCount)
        languageRecycleView.layoutManager = layoutManager


    }
}
