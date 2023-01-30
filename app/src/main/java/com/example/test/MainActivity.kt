package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but1 : Button = findViewById(R.id.btn_start)
        var editText : EditText = findViewById(R.id.edittext)
        but1.setOnClickListener {
            if(editText.text.isEmpty()){
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,quiz::class.java)
                startActivity(intent)
            }
        }
    }
}