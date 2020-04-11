package com.example.snsd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persons = listOf(
            Person("Kim Tae Yeon", "9/3/1989", R.drawable.profile_taeyeon_1),
            Person("Im Yoon Ah", "9/3/1989", R.drawable.yoona),
            Person("Choi Soo-young", "10/2/1990", R.drawable.choi),
            Person("Lee Soon-kyu", "15/5/1989", R.drawable.sunny),
            Person("Kwon Yoo-ri", "5/12/1989", R.drawable.yuri),
            Person("Seo Joo-hyun", "28/6/1991", R.drawable.seohyun_p001)
        )

        my_recycler_view.layoutManager = LinearLayoutManager (this)
        my_recycler_view.setHasFixedSize (true)
        my_recycler_view.adapter = MyCustomAdapter (persons, {person -> personItemClicked(person)})
    }

     fun personItemClicked(person: Person) {
        var intent= Intent(this, Secound::class.java)
        intent.putExtra("NAME",person.name)
        intent.putExtra("BIRTH",person.birth)
         intent.putExtra("TEXT", person.name)
        intent.putExtra("IMAGE",person.image.toString())
        startActivity(intent)
    }
}
