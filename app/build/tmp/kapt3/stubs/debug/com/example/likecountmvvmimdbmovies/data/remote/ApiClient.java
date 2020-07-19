package com.example.likecountmvvmimdbmovies.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/remote/ApiClient;", "", "()V", "API_BASE_URL", "", "servicesApiInterface", "Lcom/example/likecountmvvmimdbmovies/data/remote/ApiClient$ServicesApiInterface;", "build", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "ServicesApiInterface", "app_debug"})
public final class ApiClient {
    private static final java.lang.String API_BASE_URL = "https://api.themoviedb.org";
    private static com.example.likecountmvvmimdbmovies.data.remote.ApiClient.ServicesApiInterface servicesApiInterface;
    public static final com.example.likecountmvvmimdbmovies.data.remote.ApiClient INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.likecountmvvmimdbmovies.data.remote.ApiClient.ServicesApiInterface build() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor interceptor() {
        return null;
    }
    
    private ApiClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/remote/ApiClient$ServicesApiInterface;", "", "movies", "Lretrofit2/Response;", "Lcom/example/likecountmvvmimdbmovies/data/remote/MovieResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface ServicesApiInterface {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "/3/movie/popular?api_key=0de9947f74b0a13182547181e49a324b&language=en-US&page=1")
        public abstract java.lang.Object movies(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.likecountmvvmimdbmovies.data.remote.MovieResponse>> p0);
    }
}