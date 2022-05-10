package com.example.jewelerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.jewelerapp.recyclerview.JewelerAdapter
import com.example.jewelerapp.recyclerview.JewelerItems

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val data = arrayListOf<JewelerItems>()
        data.add(JewelerItems("Кәріптас", R.drawable.image1))
        data.add(JewelerItems("Маржан", R.drawable.image2))
        data.add(JewelerItems("Айлин", R.drawable.image3))
        data.add(JewelerItems("Айдын", R.drawable.image4))

        val adapter =  JewelerAdapter(data, applicationContext)
        recyclerView.adapter = adapter
    }
}