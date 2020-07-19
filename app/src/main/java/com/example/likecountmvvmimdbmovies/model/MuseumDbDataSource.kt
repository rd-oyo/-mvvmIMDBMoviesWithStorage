package com.example.likecountmvvmimdbmovies.model

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.likecountmvvmimdbmovies.data.db.DbDataSource
import com.example.likecountmvvmimdbmovies.data.db.MovieDTO
import com.example.likecountmvvmimdbmovies.data.db.MovieDao
import com.example.likecountmvvmimdbmovies.data.db.MovieDataBase

class MovieDbDataSource(context:Context): DbDataSource {
    private lateinit var movieDao: MovieDao
    init {
        val db = MovieDataBase.getInstance(context)
        db?.let {
            movieDao = it.movieDao()
        }
    }
    override fun movies(): LiveData<List<MovieDTO>> {
        return movieDao.movies()
    }

    override suspend fun addMovies(movies: List<MovieDTO>) {
        return movieDao.add(movies)
    }

    override suspend fun deleteMovies() {
        movieDao.deleteAll()
    }
}