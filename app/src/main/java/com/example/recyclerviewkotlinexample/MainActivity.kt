package com.example.recyclerviewkotlinexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsList = listOf<Students>(
            Students(
                R.drawable.bakutodo,
                "A. Fredy",
                "XI RPL 6, kelas XI RPL, absen 01"
            ),
            Students(
                R.drawable.bakutodoo,
                "Nama Anggota 2",
                "Nama Anggota 2, kelas XI RPL, absen 02"
            ),
            Students(
                R.drawable.nolimits,
                "Nama Anggota 3",
                "Nama Anggota 3, kelas XI RPL, absen 03"
            ),
            Students(
                R.drawable.chan,
                "Nama Anggota 4",
                "Nama Anggota 4, kelas XI RPL, absen 04"
            ),
            Students(
                R.drawable.cherry,
                "Nama Anggota 5",
                "Nama Anggota 5, kelas XI RPL, absen 05"
            ),
            Students(
                R.drawable.bakutodo,
                "Nama Anggota 6",
                "Nama Anggota 6, kelas XI RPL, absen 06"
            ),
            Students(
                R.drawable.bakutodoo,
                "Nama Anggota 7",
                "Nama Anggota 7, kelas XI RPL, absen 07"
            ),
            Students(
                R.drawable.nolimits,
                "Nama Anggota 8",
                "Nama Anggota 8, kelas XI RPL, absen 08"
            ),
            Students(
                R.drawable.chan,
                "Nama Anggota 9",
                "Nama Anggota 9, kelas XI RPL, absen 09"
            ),
            Students(
                R.drawable.cherry,
                "Nama Anggota 10",
                "Nama Anggota 10, kelas XI RPL, absen 10"
            ),
            )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_students)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = StudentsAdapter(this, studentsList){
            val intent = Intent(this, DetailStudentsActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}