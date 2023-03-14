package com.mmc.livros.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "book")
class BookEntity(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var title: String,
        var author: String,
        var genre: String,
        var numPages: Int,
        var synopsis: String,
        var publishingCompany: String,
        var publishingDate: Int,
        var numBooks: Int,
        var isbn: String
) {

}
