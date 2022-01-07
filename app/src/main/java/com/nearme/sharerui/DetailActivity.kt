package com.nearme.sharerui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nearme.sharerui.adapter.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.btn_purple.*
import kotlinx.android.synthetic.main.toolbar_layout.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initialize()
        recyclerInitialize()
        clicks()

    }

    private fun recyclerInitialize() {
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = RecyclerAdapter()
    }

    private fun clicks() {
        toolbar_back.setOnClickListener {
            finish()
        }
    }

    private fun initialize() {
        toolbar_title.text = resources.getString(R.string.view_profile)
        btnPurple.text = resources.getString(R.string.follow)
    }
}