package com.example.likecountmvvmimdbmovies.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/viewmodel/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "remoteRepository", "Lcom/example/likecountmvvmimdbmovies/data/remote/MovieRemoteDataSource;", "dbRepository", "Lcom/example/likecountmvvmimdbmovies/model/MovieDbRepository;", "(Lcom/example/likecountmvvmimdbmovies/data/remote/MovieRemoteDataSource;Lcom/example/likecountmvvmimdbmovies/model/MovieDbRepository;)V", "_isViewLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isViewLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "movies", "", "Lcom/example/likecountmvvmimdbmovies/model/Movie;", "getMovies", "cancel", "", "retrieveMovies", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isViewLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isViewLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.likecountmvvmimdbmovies.model.Movie>> movies = null;
    private final com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource remoteRepository = null;
    private final com.example.likecountmvvmimdbmovies.model.MovieDbRepository dbRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isViewLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.likecountmvvmimdbmovies.model.Movie>> getMovies() {
        return null;
    }
    
    public final void retrieveMovies() {
    }
    
    public final void cancel() {
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource remoteRepository, @org.jetbrains.annotations.NotNull()
    com.example.likecountmvvmimdbmovies.model.MovieDbRepository dbRepository) {
        super();
    }
}