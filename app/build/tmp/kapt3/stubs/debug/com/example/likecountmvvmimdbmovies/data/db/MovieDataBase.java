package com.example.likecountmvvmimdbmovies.data.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.likecountmvvmimdbmovies.data.db.MovieDTO.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/db/MovieDataBase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/example/likecountmvvmimdbmovies/data/db/MovieDao;", "Companion", "app_debug"})
public abstract class MovieDataBase extends androidx.room.RoomDatabase {
    private static com.example.likecountmvvmimdbmovies.data.db.MovieDataBase INSTANCE;
    private static final java.lang.String DBNAME = "MovieWithLikes.db";
    public static final com.example.likecountmvvmimdbmovies.data.db.MovieDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.likecountmvvmimdbmovies.data.db.MovieDao movieDao();
    
    public MovieDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/likecountmvvmimdbmovies/data/db/MovieDataBase$Companion;", "", "()V", "DBNAME", "", "INSTANCE", "Lcom/example/likecountmvvmimdbmovies/data/db/MovieDataBase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.likecountmvvmimdbmovies.data.db.MovieDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}