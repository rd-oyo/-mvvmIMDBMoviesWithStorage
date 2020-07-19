package com.example.likecountmvvmimdbmovies.data.db

import androidx.lifecycle.LiveData

interface DbDataSource {
    fun movies(): LiveData<List<MovieDTO>>
    suspend fun addMovies(movies: List<MovieDTO>)
    suspend fun deleteMovies()
}