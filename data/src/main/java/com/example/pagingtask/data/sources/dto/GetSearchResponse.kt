package com.example.pagingtask.data.sources.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class GetSearchResponse(
    @SerializedName("response") val response: Response
)