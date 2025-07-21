package org.example.users

import kotlinx.serialization.json.Json
import java.io.File

class UsersRepository private constructor() {

    init {
        }

    private val file = File("USER_DATA.json")
    private val _users: MutableList<User> = loadAllUsers()
    val users
        get() = _users.toList()

    private fun loadAllUsers(): MutableList<User> = Json.decodeFromString(file.readText().trim())

    private var instance: UsersRepository? = null

    fun getInstance(password: String): UsersRepository{
        val correctPassword = File("password_users.txt").readText().trim()
        if (correctPassword != password) throw IllegalArgumentException("Wrong password")
        if (instance == null){
            instance = UsersRepository()
        }
        return instance!!
    }

}