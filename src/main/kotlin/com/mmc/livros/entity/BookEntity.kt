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
) {

}
