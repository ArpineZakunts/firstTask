package com.example.pagingtask.data.sources.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Response(
    @SerializedName("currentPage")val currentPage: Int,
    @SerializedName("orderBy")val orderBy: String,
    @SerializedName("pageSize")val pageSize: Int,
    @SerializedName("pages")val pages: Int,
    @SerializedName("results")val results: List<Result>,
    @SerializedName("startIndex")val startIndex: Int,
    @SerializedName("status")val status: String,
    @SerializedName("total")val total: Int,
    @SerializedName("userTier")val userTier: String
)