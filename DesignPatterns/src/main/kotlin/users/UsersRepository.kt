package org.example.users

import kotlinx.serialization.json.Json
import java.io.File

class UsersRepository(password: String) {

    init {
        val correctPassword = File("password_users.txt").readText().trim()
        if (correctPassword != password) throw IllegalArgumentException("Wrong password")
    }

    private val file = File("USER_DATA.json")
    private val _users: MutableList<User> = loadAllUsers()
    val users
        get() = _users.toList()

    private fun loadAllUsers(): MutableList<User> = Json.decodeFromString(file.readText().trim())
}