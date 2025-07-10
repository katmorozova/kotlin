package org.example.profile

import org.example.extentions.transform


fun main() {
    val profiles = ProfilesRepository.profiles
        .filter { it.age > 25 }
        .filter { it.gender == Gender.MALE }
        .filter { it.firstName.startsWith("A") }
        .filter { it.age < 30 }
        .toSet()
        .map { it.copy(age = it.age + 1) }
        .map { it.firstName }

    for (person in profiles){
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


