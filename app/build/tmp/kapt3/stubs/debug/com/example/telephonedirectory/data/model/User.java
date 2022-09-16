package com.example.telephonedirectory.data.model;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Lcom/example/telephonedirectory/data/model/User;", "", "userName", "", "userNumber", "userImage", "", "(Ljava/lang/String;Ljava/lang/String;[B)V", "id", "", "getId", "()I", "setId", "(I)V", "getUserImage", "()[B", "setUserImage", "([B)V", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "getUserNumber", "setUserNumber", "app_debug"})
public final class User {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "userName")
    private java.lang.String userName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "userNumber")
    private java.lang.String userNumber;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "userImage")
    private byte[] userImage;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.String userName, @org.jetbrains.annotations.Nullable()
    java.lang.String userNumber, @org.jetbrains.annotations.Nullable()
    byte[] userImage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserNumber() {
        return null;
    }
    
    public final void setUserNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final byte[] getUserImage() {
        return null;
    }
    
    public final void setUserImage(@org.jetbrains.annotations.Nullable()
    byte[] p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
}