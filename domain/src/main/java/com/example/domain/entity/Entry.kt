package com.example.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("entry")
data class Entry(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val API: String,
    val Auth: String,
    val Category: String,
    val Cors: String,
    val Description: String,
    val HTTPS: Boolean,
    val Link: String
)