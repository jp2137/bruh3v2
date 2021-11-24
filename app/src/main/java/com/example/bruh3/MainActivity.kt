package com.example.bruh3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener{
            findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.kremowka)
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.jp1)
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.jp2)
        }
        findViewById<Button>(R.id.button4).setOnClickListener{
            findViewById<ImageView>(R.id.imageView1).setImageResource(R.drawable.jp3)
        }
    }
}