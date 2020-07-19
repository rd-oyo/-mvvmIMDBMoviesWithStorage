package com.example.likecountmvvmimdbmovies.data.remote

import com.example.likecountmvvmimdbmovies.data.OperationResult
import com.example.likecountmvvmimdbmovies.model.Movie

interface MovieRemoteDataSource {
    suspend fun retrieveMovies(): OperationResult<Movie>
}