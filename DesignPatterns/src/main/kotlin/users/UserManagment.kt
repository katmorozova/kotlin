package org.example.users

fun main() {
    UsersRepository().getInstance("qwerty").users.forEach (::println)
}