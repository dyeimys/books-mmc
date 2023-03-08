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
        val bookEntity = BookEntity(title = bookDto.title)
        val save = bookRepository.save(bookEntity)
        return BookDto(save.id, save.title)
    }

}