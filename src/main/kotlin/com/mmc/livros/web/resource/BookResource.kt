package com.mmc.livros.web.resource

import com.mmc.livros.dto.BookDto
import com.mmc.livros.service.BookService
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
) {

    @PostMapping
    fun createBook(@RequestBody bookRequest: BookRequest): BookResponse {
        val bookDto = BookDto(title = bookRequest.title,
                author = bookRequest.author,
                genre = bookRequest.genre,
                isbn = bookRequest.isbn,
                numBooks = bookRequest.numBooks,
                numPages = bookRequest.numPages,
                synopsis = bookRequest.synopsis,
                publishingCompany = bookRequest.publishingCompany,
                publishingDate = bookRequest.publishingDate)
        val createBook = bookService.createBook(bookDto)
        return BookResponse(createBook.id, createBook.title)
    }
}