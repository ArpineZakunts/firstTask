package com.example.pagingtask.domain.model

data class ResultEntity(
    val apiUrl: String,
    val fields: FieldsEntity,
    val id: String,
    val isHosted: Boolean,
    val pillarId: String,
    val pillarName: String,
    val sectionId: String,
    val sectionName: String,
    val tags: List<TagEntity>,
    val type: String,
    val webPublicationDate: String,
    val webTitle: String,
    val webUrl: String
)