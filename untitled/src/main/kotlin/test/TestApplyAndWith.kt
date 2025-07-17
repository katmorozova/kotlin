package org.example.test

import org.example.extentions.myApply

fun main() {


}


fun exampleWith(){
    with(mutableListOf<Int>()) {
        while (true){
            println("Enter number or 0 to exit: ")
            val number = readln().toInt().takeIf { it != 0 } ?: break
            add(number)
        }
        println("Max: ${max()}")
        println("Min: ${min()}")
        this
    }.forEach { println(it)}
}





fun exampleApply(){
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

    mutableListOf<Int>().apply {
        while (true){
            println("Enter number or 0 to exit: ")
            val number = readln().toInt()
            if (number == 0) break
            add(number)
        }
    }.forEach { println(it)}

    mutableListOf<Int>().apply {
        while (true){
            println("Enter number or 0 to exit: ")
            val number = readln().toInt().takeIf { it != 0 } ?: break
            add(number)
        }
    }.forEach { println(it)}

}