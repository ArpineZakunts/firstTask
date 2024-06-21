package com.example.pagingtask.data.mapper

import com.example.pagingtask.data.Mapper
import com.example.pagingtask.data.sources.dto.Result
import com.example.pagingtask.domain.model.ResultEntity

class ResultMapper :
    Mapper<Result, ResultEntity> {
    override fun transform(data: Result): ResultEntity {
        return ResultEntity(
            return ResultEntity(
                apiUrl = data.apiUrl,
                id = data.id,
                isHosted = data.isHosted,
                pillarId = data.pillarId,
                pillarName = data.pillarName,
                sectionId = data.sectionId,
                sectionName = data.sectionName,
                type = data.type,
                webPublicationDate = data.webPublicationDate,
                webTitle = data.webTitle,
                webUrl = data.webUrl,
                tags =
            )
    }
}