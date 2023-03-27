package com.mmc.livros.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity(name = "book")
data class BookEntity(
        @Id
        @GeneratedValue
        @field:NotBlank var id: Long? = null, //não entendi muito bem esse "Long? = null", podes me explicar?
        @field:Size(min = 1) var title: String,
        @field:Size(min = 1) var author: String,
        @field:NotBlank var genre: String,
        @field:NotBlank var numPages: Int,
        @field:NotBlank var synopsis: String,
        @field:NotBlank var publishingCompany: String,
        @field:NotBlank var publishingDate: Int,
        @field:NotBlank var numBooks: Int,
        @field:NotNull var isbn: String
)
