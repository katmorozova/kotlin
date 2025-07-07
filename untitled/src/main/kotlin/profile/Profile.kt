package org.example.profile

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val profiles = ProfilesRepository.profiles
    var filtered = filter(profiles, ConditionOlderThan25())
    filtered = filter(profiles, ConditionMale())
    filtered = filter(profiles, ConditionStartsWithA())
    for (person in filtered){
        println(person)
    }
}

fun filter(profiles: List<Person>, condition: Condition): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (condition.isSuitable(person)){
            result.add(person)
        }
    }
    return result
}
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

