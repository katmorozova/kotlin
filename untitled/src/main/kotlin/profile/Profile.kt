package org.example.profile

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val file = File("profiles.json")
    val profiles = loadProfiles(file)
    for (person in profiles){
        println(person)
    }
}

fun loadProfiles(file: File): List<Person>{
    val content = file.readText().trim()
    return Json.decodeFromString(content)
}