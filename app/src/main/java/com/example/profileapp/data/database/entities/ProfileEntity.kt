package com.example.profileapp.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profile")
data class ProfileEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val document: String,
    val birthDate: String,
    val city: String,
    val photo: String,
    val activeUser: Boolean
)
