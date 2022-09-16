package com.example.telephonedirectory.data.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.telephonedirectory.data.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao
}