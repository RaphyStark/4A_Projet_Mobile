package com.example.mobile4a.data.repository

import com.example.mobile4a.data.local.DataBaseDao
import com.example.mobile4a.data.local.models.toData
import com.example.mobile4a.data.local.models.toEntity
import com.example.mobile4a.domain.entity.User


class UserRepository(
        private val dataBaseDao: DataBaseDao
) {
    suspend fun createUser(user: User) {
        dataBaseDao.insert(user.toData())
    }

    fun getUser(email: String): User? {
        val userLocal = dataBaseDao.findByName(email)
        return userLocal?.toEntity()
    }
}