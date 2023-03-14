package com.mmc.livros.web.mapper

import com.mmc.livros.dto.BookDto
import com.mmc.livros.web.request.BookRequest
import com.mmc.livros.web.response.BookResponse
import org.mapstruct.Mapper

@Mapper
interface BookMapper {

    fun toDto(bookRequest: BookRequest): BookDto

    fun toResponse(bookDto: BookDto): BookResponse
}