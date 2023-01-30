package com.example.test

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class quiz : AppCompatActivity(),View.OnClickListener {


    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage: ImageView? = null
    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null
    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<QuizData>? = null
    private var mSelectedOptionPosition: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        progressBar=findViewById(R.id.progressbar)
        tvProgress = findViewById(R.id.progress_text)
        tvQuestion = findViewById(R.id.main_text)
        ivImage = findViewById(R.id.tv_image)
        tvOptionOne = findViewById(R.id.oneoption1)
        tvOptionTwo = findViewById(R.id.secondoption2)
        tvOptionThree = findViewById(R.id.thirdoption3)
        tvOptionFour = findViewById(R.id.forthoption4)
        mQuestionsList = QuizeObj.getQuestions()
        onQuestion()
        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
    }

    private fun onQuestion() {
        val question: QuizData =
            mQuestionsList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.

        progressBar?.progress =
            mCurrentPosition // Setting the current progress in the progressbar using the position of question
        tvProgress?.text =
            "$mCurrentPosition" + "/" + progressBar?.max // Setting up the progress text

        // Now set the current question and the options in the UI
        tvQuestion?.text = question.Question
        ivImage?.setImageResource(question.image)
        tvOptionOne?.text = question.oneOption
        tvOptionTwo?.text = question.twoOption
        tvOptionThree?.text = question.thirdOption
        tvOptionFour?.text = question.forthOption
    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.oneoption1 -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }

            }

            R.id.secondoption2 -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }

            }

            R.id.thirdoption3 -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }

            }

            R.id.forthoption4 -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }

            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.select_option
        )
    }


    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.select_option
            )
        }
    }
}