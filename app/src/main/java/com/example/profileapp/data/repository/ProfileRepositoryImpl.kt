package com.example.profileapp.data.repository

import com.example.profileapp.data.database.dao.ProfileDao
import com.example.profileapp.data.database.entities.ProfileEntity
import com.example.profileapp.data.database.mapper.toProfile
import com.example.profileapp.data.database.mapper.toProfileEntity
import com.example.profileapp.data.model.Profile
import com.example.profileapp.ui.registration.RegistrationViewParams

class ProfileRepositoryImpl(
    private val profileDao: ProfileDao
): ProfileRepository {

    override suspend fun createProfile(registrationViewParams: RegistrationViewParams) {
        val profileEntity = registrationViewParams.toProfileEntity()
        profileDao.insertProfile(profileEntity)
    }

    override suspend fun getProfile(id: Int): Profile {
        return profileDao.getProfileById(id).toProfile()
    }

    override suspend fun deleteProfile(id: Int) {
        profileDao.deleteProfile(id)
    }

    override suspend fun updateProfile(profile: Profile) {
        val profileEntity = profile.toProfileEntity()
        profileDao.updateProfile(profileEntity)
    }

    override suspend fun getAllProfiles(): List<Profile> {
        val profileList = profileDao.getAllProfiles()
        return profileList.map { it.toProfile() }
    }

    override suspend fun getActiveProfile(): List<ProfileEntity> {
        val activeProfile = profileDao.getAllProfiles()
        activeProfile.map { it.toProfile() }
        return activeProfile.filter { it.activeUser }
    }

    override suspend fun getInactiveProfiles(): List<ProfileEntity> {
        val activeProfile = profileDao.getAllProfiles()
        activeProfile.map { it.toProfile() }
        return activeProfile.filter { it.activeUser == false }
    }
}
