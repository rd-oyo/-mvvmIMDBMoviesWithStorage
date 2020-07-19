package com.example.likecountmvvmimdbmovies.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.likecountmvvmimdbmovies.data.db.DbDataSource
import com.example.likecountmvvmimdbmovies.data.db.MovieDTO

class MovieDbRepository(private val dataSource: DbDataSource) {

    fun getMovies(): LiveData<List<Movie>> {
        return Transformations.map(dataSource.movies()){
            it.map {itItem ->
                Movie(id = itItem.id,likeCount = itItem.likeCount,original_title = itItem.name ,release_date = itItem.date, poster_path = itItem.photo)
            }
        }
    }

    suspend fun sync(movieList:List<Movie>){
        dataSource.deleteMovies()
        dataSource.addMovies(movieList.map {
            MovieDTO(it.id,it.likeCount,it.original_title ,it.release_date,it.poster_path)
        })
    }
}