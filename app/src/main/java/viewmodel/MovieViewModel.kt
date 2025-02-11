package com.example.movieapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.data.model.Movie
import com.example.movieapp.data.network.ApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MovieViewModel(private val apiService: ApiService) : ViewModel() {
    private val _movies = MutableStateFlow<List<Movie>>(emptyList())
    val movies: StateFlow<List<Movie>> = _movies

    fun fetchMovies(apiKey: String) {
        viewModelScope.launch {
            try {
                val movieList = apiService.getMovies(apiKey)  // ✅ Correct API call
                _movies.value = movieList
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
