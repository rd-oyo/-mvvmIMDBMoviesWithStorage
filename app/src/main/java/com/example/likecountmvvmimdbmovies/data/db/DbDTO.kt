package com.example.likecountmvvmimdbmovies.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "tb_movie")
data class MovieDTO(@PrimaryKey val id:Int,
                     @ColumnInfo(name = "likeCount") val likeCount:Int,
                     @ColumnInfo(name = "name") val name:String,
                     @ColumnInfo(name = "date") val date:String,
                     @ColumnInfo(name = "photo") val  photo:String)