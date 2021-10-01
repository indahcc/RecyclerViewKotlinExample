package com.example.recyclerviewkotlinexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Students(
    val imgStudents: Int,
    val nameStudents: String,
    val descStudents: String
) : Parcelable
