package com.example.onclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun first(view: android.view.View) {
        Toast.makeText(this, "First Button was Clickied", Toast.LENGTH_SHORT).show()
    }
    fun  first_way(view: android.view.View) {
        Toast.makeText(this, "First way button was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun second(view: android.view.View) {
        Toast.makeText(this, "Second Button was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun Second_way(view: android.view.View) {
        Toast.makeText(this, "Second way Button was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun third(view: android.view.View) {
        Toast.makeText(this, "Third Button was Clicked", Toast.LENGTH_SHORT).show()
    }
    fun Third_way(view: android.view.View) {
        Toast.makeText(this, "Third_way Button was Clicked", Toast.LENGTH_SHORT).show()
    }
}