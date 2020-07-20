package com.example.likecountmvvmimdbmovies.model

import java.io.Serializable
 
data class Movie(
    var likeCount:Int = 0,
    var popularity: Double =0.0,
    var vote_count: Int =0,
    var video: Boolean = false,
    var poster_path: String = "",
    var id: Int =0,
    var adult: Boolean = false,
    var backdrop_path: String ="",
    var original_language: String ="",
    var original_title: String ="",
    var genre_ids: List<Int> ?= null,
    var title: String = "",
    var vote_average: Double =0.0,
    var overview: String ="",
    var release_date: String = ""
) : Serializable
