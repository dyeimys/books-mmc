package com.mmc.livros.repository

import com.mmc.livros.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookEntity, Long> {
}