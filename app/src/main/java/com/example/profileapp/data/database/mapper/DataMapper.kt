package com.example.profileapp.data.database.mapper

import com.example.profileapp.data.database.entities.ProfileEntity
import com.example.profileapp.data.model.Profile
import com.example.profileapp.ui.registration.RegistrationViewParams


fun RegistrationViewParams.toProfileEntity() = ProfileEntity(
    name = name,
    document = document,
    birthDate = birthDate,
    city = city,
    photo = photo,
    activeUser = activeUser
)

fun ProfileEntity.toProfile() = Profile(
    id = id,
    name = name,
    document = document,
    birthDate = birthDate,
    city = city,
    photo = photo,
    activeUser = activeUser
)

fun Profile.toProfileEntity() = ProfileEntity(
    id = id,
    name = name,
    document = document,
    birthDate = birthDate,
    city = city,
    photo = photo,
    activeUser = activeUser
)