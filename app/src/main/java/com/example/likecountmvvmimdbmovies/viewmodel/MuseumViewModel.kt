package com.example.likecountmvvmimdbmovies.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.likecountmvvmimdbmovies.data.OperationResult
import com.example.likecountmvvmimdbmovies.model.Movie
import com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource
import com.example.likecountmvvmimdbmovies.model.MovieDbRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MovieViewModel(private val remoteRepository: MovieRemoteDataSource,
                     private val dbRepository: MovieDbRepository
):ViewModel() {

    private val _isViewLoading=MutableLiveData<Boolean>()
    val isViewLoading:LiveData<Boolean> = _isViewLoading

    val movies = dbRepository.getMovies()

    fun retrieveMovies(){
        _isViewLoading.postValue(true)
        viewModelScope.launch {
            var  result: OperationResult<Movie> = withContext(Dispatchers.IO){
                remoteRepository.retrieveMovies()
            }
            _isViewLoading.postValue(false)
            if(result is OperationResult.Success){
                withContext((Dispatchers.IO)) {
                    result.data?.let {
                        if (it.isNotEmpty()) dbRepository.sync(it)
                    }
                }
            }
        }
    }

    fun cancel(){
        viewModelScope.cancel()
    }
}