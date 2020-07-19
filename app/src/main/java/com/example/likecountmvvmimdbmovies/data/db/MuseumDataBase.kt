package com.example.likecountmvvmimdbmovies.data.db
import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

@Database(entities = [MovieDTO::class], version = 2)
abstract class MovieDataBase: RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object {
        private var INSTANCE: MovieDataBase? = null
        private const val DBNAME="MovieWithLikes.db"

        fun getInstance(context: Context): MovieDataBase? {
            if (INSTANCE == null) {
                synchronized(MovieDataBase::class) {
                    INSTANCE = databaseBuilder(context,
                        MovieDataBase::class.java, DBNAME
                    )
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}