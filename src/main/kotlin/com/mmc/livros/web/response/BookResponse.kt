package com.mmc.livros.web.response

data class BookResponse(
        var id: Long?,
        var title: String,
        var author: String,
        var genre: String,
        var numPages: Int,
        var synopsis: String,
        var publishingCompany: String,
        var publishingDate: Int,
        var numBooks: Int,
        var isbn: String
)
