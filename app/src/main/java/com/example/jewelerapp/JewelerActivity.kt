package com.example.jewelerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class JewelerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jeweler)

        val imageView = findViewById<ImageView>(R.id.placeImage)
        val title =  findViewById<TextView>(R.id.title)
        val about = findViewById<TextView>(R.id.textViewAbout)
        val position = getIntent().getIntExtra("position", 0)
        val titleString = getIntent().getStringExtra("name")
        val image = getIntent().getIntExtra("image", R.drawable.image1)

        imageView.setImageResource(image)
        title.setText(titleString)

        when(position){
            0-> {
                about.setText(R.string.text1)
            }
            1-> {
                about.setText(R.string.text2)
            }
            2-> {
                about.setText(R.string.text3)
            }
            3-> {
                about.setText(R.string.text4)
            }
        }
    }
}