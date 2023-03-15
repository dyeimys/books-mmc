package com.mmc.livros.dto

data class BookDto(
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