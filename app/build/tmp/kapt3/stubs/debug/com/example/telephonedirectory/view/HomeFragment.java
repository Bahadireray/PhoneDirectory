package com.example.telephonedirectory.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0012\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0016H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/telephonedirectory/view/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/telephonedirectory/adapter/UserListAdapter$Listener;", "()V", "_binding", "Lcom/example/telephonedirectory/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/telephonedirectory/databinding/FragmentHomeBinding;", "mDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "userDao", "Lcom/example/telephonedirectory/data/roomdb/UserDao;", "userDataBase", "Lcom/example/telephonedirectory/data/roomdb/UserDataBase;", "userListAdapter", "Lcom/example/telephonedirectory/adapter/UserListAdapter;", "getFromSQL", "", "handleResponse", "userList", "", "Lcom/example/telephonedirectory/data/model/User;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onLongItemClick", "user", "onViewCreated", "view", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.example.telephonedirectory.adapter.UserListAdapter.Listener {
    private com.example.telephonedirectory.adapter.UserListAdapter userListAdapter;
    private com.example.telephonedirectory.databinding.FragmentHomeBinding _binding;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable mDisposable = null;
    private com.example.telephonedirectory.data.roomdb.UserDao userDao;
    private com.example.telephonedirectory.data.roomdb.UserDataBase userDataBase;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.telephonedirectory.databinding.FragmentHomeBinding getBinding() {
        return null;
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
    
    public final void getFromSQL() {
    }
    
    private final void handleResponse(java.util.List<com.example.telephonedirectory.data.model.User> userList) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void handleResponse() {
    }
    
    @java.lang.Override()
    public void onLongItemClick(@org.jetbrains.annotations.NotNull()
    com.example.telephonedirectory.data.model.User user) {
    }
}