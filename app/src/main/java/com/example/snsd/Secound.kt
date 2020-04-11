package com.example.snsd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secound.*
import kotlinx.android.synthetic.main.item.*

class Secound : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secound)

        ten.text= intent.getStringExtra("NAME")
        sn.text= intent.getStringExtra("BIRTH")
        text.text=intent.getStringExtra("TEXT")
        hinhanh2.setImageResource(intent.getStringExtra("IMAGE").toInt())
    }
}
