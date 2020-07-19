package com.example.likecountmvvmimdbmovies.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy.REPLACE
import com.example.likecountmvvmimdbmovies.data.db.MovieDTO

@Dao
interface MovieDao {
    @Query("SELECT * from tb_movie")
    fun movies(): LiveData<List<MovieDTO>>

    @Insert(onConflict = REPLACE)
    suspend fun add(movie: List<MovieDTO>)

    @Query("DELETE from tb_movie")
    suspend fun deleteAll()
}