package com.mmc.livros.service

import com.mmc.livros.dto.BookDto
import com.mmc.livros.entity.BookEntity
import com.mmc.livros.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BookService(
        @Autowired
        private var bookRepository: BookRepository
) {

    fun createBook(bookDto: BookDto): BookDto {
        val bookEntity = BookEntity(title = bookDto.title,
                author = bookDto.author,
                genre = bookDto.genre,
                isbn = bookDto.isbn,
                numBooks = bookDto.numBooks,
                numPages = bookDto.numPages,
                synopsis = bookDto.synopsis,
                publishingCompany = bookDto.publishingCompany,
                publishingDate = bookDto.publishingDate)
        val save = bookRepository.save(bookEntity)
        return BookDto(save.id,
                save.title,
                save.author,
                save.genre,
                save.numPages,
                save.synopsis,
                save.publishingCompany,
                save.publishingDate,
                save.numBooks,
                save.isbn)
    }

}