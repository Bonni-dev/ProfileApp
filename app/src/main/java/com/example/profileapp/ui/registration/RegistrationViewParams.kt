package com.example.profileapp.ui.registration

data class RegistrationViewParams (
    var name: String = "",
    var document: String = "",
    var birthDate: String = "",
    var city: String = "",
    var photo: String = "",
    var activeUser: Boolean = true
)
