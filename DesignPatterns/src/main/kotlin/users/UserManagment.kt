package org.example.users

fun main() {
    UsersRepository("qwerty").users.forEach (::println)
}