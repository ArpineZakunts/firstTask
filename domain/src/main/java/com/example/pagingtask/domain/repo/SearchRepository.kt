package com.example.pagingtask.domain.repo

import com.example.pagingtask.domain.model.ResultEntity
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    fun getList(): Flow<List<ResultEntity>>
}