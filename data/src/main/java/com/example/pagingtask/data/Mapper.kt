package com.example.pagingtask.data

interface Mapper<Response, UI> {
    fun transform(data: Response): UI
}