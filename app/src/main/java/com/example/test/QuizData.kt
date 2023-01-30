package com.example.test

import android.media.Image

data class QuizData(
    val id:Int,
    val Question:String,
    val image:Int,
    val oneOption:String,
    val twoOption:String,
    val thirdOption:String,
    val forthOption:String,
    val correctanswer:Int,
)
