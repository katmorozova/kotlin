package org.example.test

fun main() {
    /*
    val numbers = mutableListOf<Int>()
    while (true){
        println("Enter number or 0 to exit: ")
        val number = readln().toInt()
        if (number == 0) break
        numbers.add(number)
    }
    for (number in numbers){
        println(number)
    }

     */

    mutableListOf<Int>().also {
        while (true){
            println("Enter number or 0 to exit: ")
            val number = readln().toInt()
            if (number == 0) break
            it.add(number)
        }
    }.forEach { println(it)}



}