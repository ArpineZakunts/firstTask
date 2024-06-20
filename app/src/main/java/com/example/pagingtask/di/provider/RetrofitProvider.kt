package com.example.pagingtask.di.provider

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

object RetrofitProvider {
//        private const val BASE_URL = ""
//    private val loggingInterceptor by lazy {
//        HttpLoggingInterceptor().apply {
//            level = HttpLoggingInterceptor.Level.BODY
//        }
//    }
//
//    private val httpClient by lazy {
//     OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
//            .addNetworkInterceptor { chain ->
//                try {
//                    chain.proceed(chain.request())
//                } catch (e: IOException) {
//                    throw IOException("No internet connection", e)
//                }
//            }
//            .build()
//    }
//
//    fun provideRetrofit(): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .client(httpClient)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }

//    fun provideApi(retrofit: Retrofit): RecipesApi {
//        return retrofit.create(RecipesApi::class.java)
//    }
}