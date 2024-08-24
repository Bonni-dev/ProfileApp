package com.example.profileapp.data.repository

import com.example.profileapp.data.database.entities.ProfileEntity
import com.example.profileapp.data.model.Profile
import com.example.profileapp.presentation.registration.RegistrationViewParams

interface ProfileRepository {

    suspend fun createProfile(registrationViewParams: RegistrationViewParams)

    suspend fun getProfile(id: Int): Profile

    suspend fun deleteProfile(id: Int)

    suspend fun updateProfile(profile: Profile)

    suspend fun getAllProfiles(): List<Profile>

    suspend fun getActiveProfile(): List<ProfileEntity>

    suspend fun getInactiveProfiles(): List<ProfileEntity>

}