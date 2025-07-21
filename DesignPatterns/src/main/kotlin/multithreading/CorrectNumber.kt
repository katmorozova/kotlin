package org.example.multithreading

import kotlin.concurrent.thread
import kotlin.random.Random

fun main() {

    println("Enter number from 0 to 1_000_000_000: ")
    val number = readln().toInt()
    var win = false

    thread {
        var seconds = 1
        while (!win){
            println(seconds++)
            Thread.sleep(1000)
        }
    }



    thread {
        while (true){
            val correctNumber = Random.nextInt(1_000_000_001)
            if (number == correctNumber) {
                println("I win. Your number is $number")
                win = true
                break
            }
        }
    }
}