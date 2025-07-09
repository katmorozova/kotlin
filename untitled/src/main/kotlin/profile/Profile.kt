package org.example.profile

import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val profiles = ProfilesRepository.profiles
    //var filtered = filter(profiles, {person: Person -> person.age > 25})
    var filtered = filter(profiles) {it.age > 25}
    filtered = filter(filtered) {it.gender == Gender.MALE }
    filtered = filter(filtered) {it.firstName.startsWith("A") }
    filtered = filter(filtered) {it.age < 30}

    /*
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

     */
    for (person in filtered){
        println(person)
    }
    val names = transfom(filtered) {it.firstName}
    val lastNames = transfom(filtered) {it.lastName}
    val fullNames = transfom(filtered) {"${it.firstName} ${it.lastName}"}
    val ages = transfom(filtered) {it.age}
    val agesPlusOne = transfom(filtered) {it.copy(age = it.age + 1)}
    for (person in ages){
        println(person)
    }
}


fun List<Person>.filter(isSuitable: (Person) -> Boolean): List<Person> {
    val result = mutableListOf<Person>()
    for (person in this){
        if (isSuitable(person)){
            result.add(person)
        }
    }
    return result
}
/*
fun filter(profiles: List<Person>, isSuitable: (Person) -> Boolean): List<Person> {
    val result = mutableListOf<Person>()
    for (person in profiles){
        if (isSuitable(person)){
            result.add(person)
        }
    }
    return result
}

 */

fun <R> transfom(profiles: List<Person>, operation: (Person) -> R): List<R>{
    val result = mutableListOf<R>()
    for (person in profiles){
        result.add(operation(person))
    }
    return result
}
/*
fun transfom(profiles: List<Person>, operation: (Person) -> String): List<String>{
    val result = mutableListOf<String>()
    for (person in profiles){
        result.add(operation(person))
    }
    return result
}

 */

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

