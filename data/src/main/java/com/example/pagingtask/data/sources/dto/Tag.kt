package com.example.pagingtask.data.sources.dto

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Tag(
  @SerializedName("apiUrl") val apiUrl: String,
  @SerializedName("bio") val bio: String,
  @SerializedName("bylineImageUrl") val bylineImageUrl: String,
  @SerializedName("bylineLargeImageUrl") val bylineLargeImageUrl: String,
  @SerializedName("firstName") val firstName: String,
  @SerializedName("id") val id: String,
  @SerializedName("lastName") val lastName: String,
  @SerializedName("references") val references: List<String>,
  @SerializedName("sectionId") val sectionId: String,
  @SerializedName("sectionName") val sectionName: String,
  @SerializedName("twitterHandle") val twitterHandle: String,
  @SerializedName("type") val type: String,
  @SerializedName("webTitle") val webTitle: String,
  @SerializedName("webUrl") val webUrl: String
)