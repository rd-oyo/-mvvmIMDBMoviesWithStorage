package com.example.likecountmvvmimdbmovies.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource
import com.example.likecountmvvmimdbmovies.model.MovieDbRepository

class ViewModelFactory(private val remoteRepository: MovieRemoteDataSource,
                       private val dbRepository: MovieDbRepository
):ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(remoteRepository,dbRepository) as T
    }
}