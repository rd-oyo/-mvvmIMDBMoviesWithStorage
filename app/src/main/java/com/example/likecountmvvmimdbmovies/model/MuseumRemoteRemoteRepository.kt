package com.example.likecountmvvmimdbmovies.model

import com.example.likecountmvvmimdbmovies.data.remote.ApiClient
import com.example.likecountmvvmimdbmovies.data.OperationResult
import com.example.likecountmvvmimdbmovies.data.remote.MovieRemoteDataSource

class MovieRemoteRemoteRepository: MovieRemoteDataSource {

    override suspend fun retrieveMovies(): OperationResult<Movie> {
        try {
            val response = ApiClient.build()?.movies()
            response?.let {
                return if(it.isSuccessful && it.body()!=null){
                    val data = it.body()?.results
                    OperationResult.Success(data)
                }else{
                    val page = it.body()?.page
                    OperationResult.Error(java.lang.Exception("page :" + page.toString()))
                }
            }?:run{
                return OperationResult.Error(Exception("MovieRemoteRepository error"))
            }
        }catch (e:Exception){
            return OperationResult.Error(e)
        }
    }

}