package com.example.profileapp.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.profileapp.data.database.entities.ProfileEntity

@Dao
interface ProfileDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProfile(profile: ProfileEntity)

    @Query("SELECT * FROM profile WHERE id = :id")
    suspend fun getProfileById(id: Int): ProfileEntity

    @Query("UPDATE profile SET name = profile.name, document = profile.document, birthDate = profile.birthDate, city = profile.city, photo = profile.photo, activeUser = profile.activeUser  WHERE id = profile.id")
    suspend fun updateProfile(profile: ProfileEntity)

    @Query("DELETE FROM profile WHERE id = profile.id")
    suspend fun deleteProfile(id: Int)

    @Query("SELECT * FROM profile")
    suspend fun getAllProfiles(): List<ProfileEntity>
}
