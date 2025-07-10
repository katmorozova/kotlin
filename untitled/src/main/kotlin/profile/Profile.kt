package org.example.profile

import org.example.extentions.transform


fun main() {
    ProfilesRepository.profiles
        //.filter { it.age > 25 && it.gender == Gender.MALE }
        .filter { it.age > 25 }
        .filter { it.gender == Gender.MALE }
        .filter { it.firstName.startsWith("A") }
        .filter { it.age < 30 }
        .toSet()
        .map { it.copy(age = it.age + 1) }
        .forEach { println(it)}


}

fun showEmail(){
    println("Enter id: ")
    val id = readln().toInt()
    ProfilesRepository.profiles.find { it.id == id } ?.let { println(it.email) } ?: println("Not found")
}





