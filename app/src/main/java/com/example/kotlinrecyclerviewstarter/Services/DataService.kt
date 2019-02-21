package com.example.kotlinrecyclerviewstarter.Services

import com.example.kotlinrecyclerviewstarter.Model.Language
import com.example.kotlinrecyclerviewstarter.Model.Technology

//declare Singleton
object DataService {

    val technologies = listOf(
        Technology("Android","android_img"),
        Technology("iOS","ios_img"),
        Technology("Flutter","flutter_img")

    )

    val androidLanguages = listOf(
        Language("Java","android_img"),
        Language("Kotlin","android_img"),
        Language("XML","android_img"),
        Language("Java","android_img"),
        Language("Kotlin","android_img"),
        Language("XML","android_img"),
        Language("Java","android_img"),
        Language("Kotlin","android_img"),
        Language("XML","android_img"),
        Language("Java","android_img"),
        Language("Kotlin","android_img"),
        Language("XML","android_img")
    )

    val iosLanguages = listOf(
        Language("Swift","ios_img"),
        Language("Objective C","ios_img")
    )

    val flutterLanguages = listOf(
        Language("Dart","flutter_img")
    )

    val emptyLanguages = listOf<Language>()

    fun getLanguage(tech : String) : List<Language>{

        return when(tech){
            "Android" -> androidLanguages
            "iOS" -> iosLanguages
            "Flutter" -> flutterLanguages
            else -> emptyLanguages
        }
    }
}