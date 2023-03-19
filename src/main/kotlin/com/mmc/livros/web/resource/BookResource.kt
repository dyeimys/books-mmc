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
        val bookDto = bookMapper.toDto(bookRequest)
        val createBook = bookService.createBook(bookDto)
        return BookResponse(createBook.id,
                createBook.title,
                createBook.author,
                createBook.genre,
                createBook.numPages,
                createBook.synopsis,
                createBook.publishingCompany,
                createBook.publishingDate,
                createBook.numBooks,
                createBook.isbn)
    }
}