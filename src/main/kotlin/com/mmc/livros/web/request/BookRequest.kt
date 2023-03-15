package com.mmc.livros.web.request

data class BookRequest(
        val title: String,
        val author: String,
        val genre: String,
        val numPages: Int,
        val synopsis: String,
        val publishingCompany: String,
        val publishingDate: Int,
        val numBooks: Int,
        val isbn: String
)
