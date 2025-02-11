package com.example.movieapp.di

import com.example.movieapp.data.network.ApiService
import com.example.movieapp.data.network.RetrofitInstance
import com.example.movieapp.viewmodel.MovieViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // ✅ Provide ApiService instance
    single { RetrofitInstance.api }

    // ✅ Inject ApiService into ViewModel
    viewModel { MovieViewModel(get()) }
}
