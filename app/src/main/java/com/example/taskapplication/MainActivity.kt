package com.example.taskapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var photo:Button
    lateinit var  detai:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo=findViewById(R.id.userimage)
        detai=findViewById(R.id.userdetail)

        photo.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, PhotoActivity::class.java)
            startActivity(intent)

        })
        detai.setOnClickListener(View.OnClickListener {
            intent = Intent(applicationContext, UserActivity::class.java)
            startActivity(intent)

        })
    }
}