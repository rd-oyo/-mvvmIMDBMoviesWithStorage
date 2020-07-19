package com.example.likecountmvvmimdbmovies.di

import android.content.Context
import com.example.likecountmvvmimdbmovies.data.db.DbDataSource
import com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource
import com.example.likecountmvvmimdbmovies.model.MovieDbDataSource
import com.example.likecountmvvmimdbmovies.model.MovieDbRepository
import com.example.likecountmvvmimdbmovies.model.MovieRemoteRemoteRepository

object Injection {

    private val movieRepository = MovieRemoteRemoteRepository()

    private lateinit var dbDataSource: DbDataSource
    private lateinit var movieDbRepository: MovieDbRepository

    fun setup(context:Context){
        dbDataSource = MovieDbDataSource(context)
        movieDbRepository = MovieDbRepository(dbDataSource)
    }

    fun providerDBRepository(): MovieDbRepository = movieDbRepository
    fun providerRemoteRepository(): MovieRemoteDataSource = movieRepository
}