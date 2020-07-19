package com.example.likecountmvvmimdbmovies.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/di/Injection;", "", "()V", "dbDataSource", "Lcom/example/likecountmvvmimdbmovies/data/db/DbDataSource;", "movieDbRepository", "Lcom/example/likecountmvvmimdbmovies/model/MovieDbRepository;", "movieRepository", "Lcom/example/likecountmvvmimdbmovies/model/MovieRemoteRemoteRepository;", "providerDBRepository", "providerRemoteRepository", "Lcom/example/likecountmvvmimdbmovies/data/remote/MovieRemoteDataSource;", "setup", "", "context", "Landroid/content/Context;", "app_debug"})
public final class Injection {
    private static final com.example.likecountmvvmimdbmovies.model.MovieRemoteRemoteRepository movieRepository = null;
    private static com.example.likecountmvvmimdbmovies.data.db.DbDataSource dbDataSource;
    private static com.example.likecountmvvmimdbmovies.model.MovieDbRepository movieDbRepository;
    public static final com.example.likecountmvvmimdbmovies.di.Injection INSTANCE = null;
    
    public final void setup(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.likecountmvvmimdbmovies.model.MovieDbRepository providerDBRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource providerRemoteRepository() {
        return null;
    }
    
    private Injection() {
        super();
    }
}