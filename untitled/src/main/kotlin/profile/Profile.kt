package org.example.profile

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val profiles = ProfilesRepository.profiles
    var filtered = filter(profiles, {person: Person -> person.age > 25})
    filtered = filter(profiles, object : Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.gender == Gender.MALE
        }
    })
    filtered = filter(filtered, object : Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.firstName.startsWith("A")
        }
    })
    filtered = filter(filtered, object : Condition{
        override fun isSuitable(person: Person): Boolean {
            return person.age < 30
        }
    })
    for (person in filtered){
        println(person)
    }
}

fun filter(profiles: List<Person>, isSuitable: (Person) -> Boolean): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (isSuitable(person)){
            result.add(person)
        }
    }
    return result
}
/*
fun filter(profiles: List<Person>, condition: Condition): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (condition.isSuitable(person)){
            result.add(person)
        }
    }
    return result
}

 */






/*
fun filterOlderThan25(profiles: List<Person>): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (person.age > 25 ){
            result.add(person)
        }
    }
    return result
}

fun filterStartsWithA(profiles: List<Person>): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (person.firstName.startsWith("A") ){
            result.add(person)
        }
    }
    return result
}

fun filterMale(profiles: List<Person>): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (person.gender == Gender.MALE){
            result.add(person)
        }
    }
    return result
}

 */

