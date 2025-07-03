package org.example.test

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val file = File("books.json")
    writeToFileBook(file)
    val books = readFromFileBooks(file)
    for(book in books){
        println(book)
    }

}

fun readFromFileBooks(file: File): List<Book> {
    val content = file.readText().trim()
    return Json.decodeFromString<List<Book>>(content)
}


fun writeToFileBook(file: File){
    val books = mutableListOf<Book>()
    while (true){
        println("Enter id or 0 to exit: ")
        val id = readln().toInt()
        if (id == 0) break

        println("Enter name: ")
        val name = readln()
        println("Enter author: ")
        val author = readln()
        println("Enter year: ")
        val year = readln().toInt()

        val book = Book(id, name, author, year)
        books.add(book)
    }

    val booksAsString = Json.encodeToString(books)
    file.writeText(booksAsString)
}

