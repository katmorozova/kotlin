package org.example.dictionary

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import kotlin.time.measureTime

fun main() {


    val file = File("dictionary.json")
    val content = file.readText().trim()
    val dictionary = Json.decodeFromString<List<Entry>>(content)
    val dictionaryMap = dictionary.associate { it.value to it.description }
    val mapAsString = Json.encodeToString(dictionaryMap)
    file.writeText(mapAsString)
    showDescription(dictionaryMap)

}

fun showDescription(dictionary: Map<String, String>) {
    while (true){
        println("Enter word or 0 to exit: ")
        val input = readln().lowercase()
        if (input == "0") break
        val time = measureTime {
            dictionary[input]?.let { println(it)}?: println("Not found")
        }
        println("Duration: $time")

    }
}