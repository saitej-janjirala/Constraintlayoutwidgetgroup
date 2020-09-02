package com.example.hidingmutlipeviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hide.setOnClickListener{
            group.visibility= View.GONE
        }
        show.setOnClickListener {
            group.visibility= View.VISIBLE
        }
    }
}