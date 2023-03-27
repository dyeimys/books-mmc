package com.mmc.livros.web.resource

import com.mmc.livros.dto.BookDto
import com.mmc.livros.service.BookService
import com.mmc.livros.web.mapper.BookMapper
import com.mmc.livros.web.request.BookRequest
import com.mmc.livros.web.response.BookResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")
class BookResource(
        @Autowired
        var bookService: BookService,

        @Autowired
        var bookMapper: BookMapper,
) {

    @PostMapping
    fun createBook(@RequestBody bookRequest: BookRequest): BookResponse {

        return bookRequest.let {bookMapper.toDto(it)}
                .let {bookService.createBook(it)}
                .let {bookMapper.toResponse(it)}
    }
}