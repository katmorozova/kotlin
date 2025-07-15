package org.example.dictionary

import kotlinx.serialization.json.Json
import java.io.File

fun main() {


    val file = File("dictionary.json")
    val content = file.readText().trim()
    val dictionary = Json.decodeFromString<List<Entry>>(content)
    for (entry in dictionary){
        println(entry)
    }

}