package com.example.profileapp.data.model

data class Profile(
    internal val id: Int,
    internal val name: String,
    internal val document: String,
    internal val birthDate: String,
    internal val city: String,
    internal val photo: String,
    internal val activeUser: Boolean
)
