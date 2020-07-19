package com.example.likecountmvvmimdbmovies.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.likecountmvvmimdbmovies.di.Injection
import com.example.likecountmvvmimdbmovies.model.Movie
import com.example.likecountmvvmimdbmovies.viewmodel.MovieViewModel
import com.example.likecountmvvmimdbmovies.viewmodel.ViewModelFactory
import com.example.likecountmvvmimdbmovies.R
import kotlinx.android.synthetic.main.activity_movie.*
import kotlinx.android.synthetic.main.layout_error.*
import kotlinx.android.synthetic.main.row_movie.*

class MovieActivity : AppCompatActivity() {

    private lateinit var viewModel: MovieViewModel
    private lateinit var adapter: MovieAdapter

    companion object {
        const val TAG= "CONSOLE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)
        setupViewModel()
        setupUI()
    }

    // region setup ui
    private fun setupUI(){
        adapter= MovieAdapter(viewModel.movies.value?: emptyList())
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter= adapter
    }
    // endregion setup ui

    // region setup viewmodel
    private fun setupViewModel(){
        viewModel = ViewModelProviders.of(this, ViewModelFactory(
            Injection.providerRemoteRepository(),
            Injection.providerDBRepository())
        ).get(MovieViewModel::class.java)
        viewModel.movies.observe(this,renderMovies)

        viewModel.isViewLoading.observe(this,isViewLoadingObserver)
    }
    // endregion viewmodel

    //region observers
    private val renderMovies= Observer<List<Movie>> {
        Log.v(TAG, "data updated $it")
        layoutError.visibility=View.GONE
        layoutEmpty.visibility=View.GONE
        adapter.update(it)
    }

    private val isViewLoadingObserver= Observer<Boolean> {
        Log.v(TAG, "isViewLoading $it")
        val visibility=if(it)View.VISIBLE else View.GONE
        progressBar.visibility= visibility
    }

    private val onMessageErrorObserver= Observer<Any> {
        Log.v(TAG, "onMessageError $it")
        layoutError.visibility=View.VISIBLE
        layoutEmpty.visibility=View.GONE
        textViewError.text= "Error $it"
    }

    private val emptyListObserver= Observer<Boolean> {
        Log.v(TAG, "emptyListObserver $it")
        layoutEmpty.visibility=View.VISIBLE
        layoutError.visibility=View.GONE
    }
    //endregion observers

     //If you require updated data, you can call the method "loadMovie" here
     override fun onResume() {
        super.onResume()
        viewModel.retrieveMovies()
     }

}
