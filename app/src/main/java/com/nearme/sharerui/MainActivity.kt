package com.nearme.sharerui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
        clicks()
    }

    private fun clicks() {
        btnCall.setOnClickListener {
            startActivity(Intent(this@MainActivity, DetailActivity::class.java))
        }
    }


    private fun initialize() {
        ivBanner.clipToOutline = true
    }
}