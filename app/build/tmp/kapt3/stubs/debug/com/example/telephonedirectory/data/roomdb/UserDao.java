package com.example.telephonedirectory.data.roomdb;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/telephonedirectory/data/roomdb/UserDao;", "", "delete", "Lio/reactivex/rxjava3/core/Completable;", "user", "Lcom/example/telephonedirectory/data/model/User;", "getUserById", "Lio/reactivex/rxjava3/core/Flowable;", "id", "", "getUserWithNameAndId", "", "insert", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT userName,id,userNumber,userImage FROM User")
    public abstract io.reactivex.rxjava3.core.Flowable<java.util.List<com.example.telephonedirectory.data.model.User>> getUserWithNameAndId();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User WHERE id = :id")
    public abstract io.reactivex.rxjava3.core.Flowable<com.example.telephonedirectory.data.model.User> getUserById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.rxjava3.core.Completable insert(@org.jetbrains.annotations.NotNull()
    com.example.telephonedirectory.data.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.rxjava3.core.Completable delete(@org.jetbrains.annotations.NotNull()
    com.example.telephonedirectory.data.model.User user);
}