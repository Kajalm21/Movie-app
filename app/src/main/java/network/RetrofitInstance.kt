package com.example.movieapp.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://api.watchmode.com/" // Replace with the correct API URL

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())  // ✅ Ensure JSON conversion is set up
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)  // ✅ Ensure this correctly creates an ApiService
    }
}
