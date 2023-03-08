package com.mmc.livros

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksApplication

fun main(args: Array<String>) {
	runApplication<BooksApplication>(*args)
}
