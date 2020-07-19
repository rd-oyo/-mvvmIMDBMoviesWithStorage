package com.example.likecountmvvmimdbmovies.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.likecountmvvmimdbmovies.R
import com.example.likecountmvvmimdbmovies.model.Movie
import kotlinx.android.synthetic.main.row_movie.view.*

class MovieAdapter(private var movies: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_movie, parent, false)
        return MViewHolder(view)
    }

    override fun onBindViewHolder(vh: MViewHolder, position: Int) {
        //render
        vh.buttonConfig(movies[position])
        vh.bind(movies[position])
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    fun update(data: List<Movie>) {
        movies = data
        notifyDataSetChanged()
    }

    class MViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val textViewName: TextView = view.textViewName
        private val textViewDate: TextView = view.ReleaseYear
        private val textViewLike: TextView = view.likes
        private val imageView: ImageView = view.imageView
        private val imagelike = view.likesView
        private val LocalView: View = view

        init {
            imagelike.setOnClickListener(View.OnClickListener {
                val prev = imagelike.tag
                if (prev == "outline") {
                    imagelike.setImageResource(
                        R.drawable.favourite_filled
                    )
                    imagelike.tag = "filled"
                } else {
                    imagelike.setImageResource(
                        R.drawable.favourite_outline
                    )
                    imagelike.tag = "outline"
                }
            })
        }

        fun buttonConfig(movie: Movie) {
            if (LocalView.tag == "filled") {
                movie.likeCount = movie.likeCount + 1
            }
        }

        fun bind(movie: Movie) {
            textViewName.text = movie.original_title
            textViewDate.text = movie.release_date
            textViewLike.text = (movie.likeCount).toString()
            Glide.with(imageView.context)
                .load("https://image.tmdb.org/t/p/original" + movie.poster_path).into(imageView)
        }
    }
}