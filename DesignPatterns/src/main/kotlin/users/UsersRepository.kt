package org.example.users

import kotlinx.serialization.json.Json
import java.io.File

object UsersRepository {

    private val file = File("USER_DATA.json")
    private val _users: MutableList<User> = loadAllUsers()
    val users
        get() = _users.toList()

    private fun loadAllUsers(): MutableList<User> = Json.decodeFromString(file.readText().trim())
}