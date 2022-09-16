package com.example.telephonedirectory.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User(
    @ColumnInfo(name = "userName")
    var userName: String?,
    @ColumnInfo(name = "userNumber")
    var userNumber: String?,
    @ColumnInfo(name = "userImage")
    var userImage: ByteArray?
) {

    @PrimaryKey(autoGenerate = true)
    var id = 0
}