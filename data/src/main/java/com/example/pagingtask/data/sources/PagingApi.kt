package com.example.pagingtask.data.sources

import com.example.pagingtask.data.sources.dto.GetSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "test"

interface PagingApi {
    @GET("search")
    suspend fun getSearchList(@Query("api-key") apiKey: String = API_KEY): GetSearchResponse
}