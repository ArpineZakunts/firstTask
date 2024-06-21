package com.example.pagingtask.data.sources.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Fields(
   @SerializedName("headline") val headline: String,
   @SerializedName("shortUrl") val shortUrl: String,
   @SerializedName("starRating") val starRating: String,
   @SerializedName("thumbnail") val thumbnail: String
)