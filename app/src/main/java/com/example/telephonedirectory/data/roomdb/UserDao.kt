package com.example.telephonedirectory.data.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.telephonedirectory.data.model.User
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable

@Dao
interface UserDao {


    @Query("SELECT userName,id,userNumber,userImage FROM User")
    fun getUserWithNameAndId(): Flowable<List<User>>

    @Query("SELECT * FROM User WHERE id = :id")
    fun getUserById(id: Int): Flowable<User>

    @Insert
    fun insert(user: User): Completable

    @Delete
    fun delete(user: User): Completable
}