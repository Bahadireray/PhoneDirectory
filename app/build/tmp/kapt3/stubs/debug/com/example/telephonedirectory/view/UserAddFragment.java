package com.example.telephonedirectory.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020 H\u0002J\u0016\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020,J\u0012\u0010-\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J&\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u0001052\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00106\u001a\u00020&H\u0016J\u001a\u00107\u001a\u00020&2\u0006\u00108\u001a\u0002012\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00109\u001a\u00020&H\u0002J\u000e\u0010:\u001a\u00020&2\u0006\u00108\u001a\u000201J\u000e\u0010;\u001a\u00020&2\u0006\u00108\u001a\u000201R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006<"}, d2 = {"Lcom/example/telephonedirectory/view/UserAddFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/telephonedirectory/databinding/FragmentUserAddBinding;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "binding", "getBinding", "()Lcom/example/telephonedirectory/databinding/FragmentUserAddBinding;", "mDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "permissionLauncher", "", "selectedBitmap", "Landroid/graphics/Bitmap;", "getSelectedBitmap", "()Landroid/graphics/Bitmap;", "setSelectedBitmap", "(Landroid/graphics/Bitmap;)V", "selectedPicture", "Landroid/net/Uri;", "getSelectedPicture", "()Landroid/net/Uri;", "setSelectedPicture", "(Landroid/net/Uri;)V", "userDao", "Lcom/example/telephonedirectory/data/roomdb/UserDao;", "userDataBase", "Lcom/example/telephonedirectory/data/roomdb/UserDataBase;", "userFromMain", "Lcom/example/telephonedirectory/data/model/User;", "getUserFromMain", "()Lcom/example/telephonedirectory/data/model/User;", "setUserFromMain", "(Lcom/example/telephonedirectory/data/model/User;)V", "handleResponse", "", "handleResponseWithOldUser", "user", "makeSmallerBitmap", "image", "maximumSize", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "registerLauncher", "save", "selectedImg", "app_debug"})
public final class UserAddFragment extends androidx.fragment.app.Fragment {
    private com.example.telephonedirectory.databinding.FragmentUserAddBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private com.example.telephonedirectory.data.model.User userFromMain;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri selectedPicture;
    @org.jetbrains.annotations.Nullable()
    private android.graphics.Bitmap selectedBitmap;
    private com.example.telephonedirectory.data.roomdb.UserDao userDao;
    private com.example.telephonedirectory.data.roomdb.UserDataBase userDataBase;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable mDisposable = null;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String> permissionLauncher;
    
    public UserAddFragment() {
        super();
    }
    
    private final com.example.telephonedirectory.databinding.FragmentUserAddBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.telephonedirectory.data.model.User getUserFromMain() {
        return null;
    }
    
    public final void setUserFromMain(@org.jetbrains.annotations.Nullable()
    com.example.telephonedirectory.data.model.User p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getSelectedPicture() {
        return null;
    }
    
    public final void setSelectedPicture(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getSelectedBitmap() {
        return null;
    }
    
    public final void setSelectedBitmap(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleResponseWithOldUser(com.example.telephonedirectory.data.model.User user) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void handleResponse() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap makeSmallerBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image, int maximumSize) {
        return null;
    }
    
    public final void selectedImg(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void registerLauncher() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}