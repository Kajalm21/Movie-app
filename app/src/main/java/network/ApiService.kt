package com.example.movieapp.data.network

import com.example.movieapp.data.model.Movie
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v1/movies")  // Replace with the correct endpoint
    suspend fun getMovies(@Query("apiKey") apiKey: String): List<Movie>
}
