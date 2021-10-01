package com.example.recyclerviewkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailStudentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_student)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val students = intent.getParcelableExtra<Students>(MainActivity.INTENT_PARCELABLE)

        val imgStudents = findViewById<ImageView>(R.id.img_item_photo)
        val nameStudents = findViewById<TextView>(R.id.tv_item_name)
        val descStudents = findViewById<TextView>(R.id.tv_item_description)

        imgStudents.setImageResource(students?.imgStudents!!)
        nameStudents.text = students.nameStudents

        descStudents.text = students.descStudents
        }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}