package org.example.test

import kotlinx.serialization.json.Json
import java.io.File


//val numbers = mutableListOf<Int>()

var age: Int? = 20

fun main() {

    val result = age?.let{
        if (it >= 18){
            "You are an adult"
        }else{
            "You will be an adult in ${18 - it} years"
        }
    }
        result?.let{
            println(it)
        }
    }





    //println(sum(5, 10))
   // val file = File("test.txt")
   // val number = file.readText().trim().toInt()
    //println(sum(5, number))
    /*
    val file = File("items.json")
    //writeToFile(file)

    val items = readFromFile(file)
    for(item in items){
        println(item)
    }
     */


/*
fun readFromFile(file: File): List<Item> {
    //val items = mutableListOf<Item>()
    val content = file.readText().trim()
    //val itemsAsString = content.split("\n")
    return Json.decodeFromString<List<Item>>(content)
   /*
    for (itemAsString in itemsAsString){
        val properties = itemAsString.split("%")
        val id = properties[0].toInt()
        val name = properties[1]
        val item = Item(id, name)
        items.add(item)
    }


    //return items
}
*/

/*
fun writeToFile(file: File){
    val items = mutableListOf<Item>()
    while (true){
        println("Enter id or 0 to exit: ")
        val id = readln().toInt()
        if (id == 0) break
        println("Enter name: ")
        val name = readln()
        val item = Item(id, name)
        items.add(item)
    }

    //for (item in items){
        //println(item)
        //file.appendText("${item.id}%${item.name}\n")

    //}
    //val itemsAsString = Json.encodeToString(items)
   // file.writeText(itemsAsString)
//}*/
/*
fun sum(a:Int): Int {
    val file = File("test.txt")
    val number = file.readText().trim().toInt()
    return a + number
}

 */

/*
fun sum(a:Int, b: Int): Int {
    return a + b
}

 */
/*
fun sum(a:Int, b: Int): Int {
    val result = a + b
    numbers.add(result)
    return result
}

 */