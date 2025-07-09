package org.example.extentions

fun <R, T> List<T>.transform(operation: (T) -> R): List<R>{
    val result = mutableListOf<R>()
    for (person in this){
        result.add(operation(person))
    }
    return result
}