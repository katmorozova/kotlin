package corporation

import corporation.Director

fun main() {
    /*
    val assistant: corporation.Assistant = corporation.Assistant()
    assistant.bringCoffee(5, "cafe con leche")

     */
/*
    println("Input name: ")
    val name = readln()
    println("Input brand: ")
    val brand = readln()
    println("Input size: ")
    val size = readln().toFloat()
    println("Input price: ")
    val price = readln().toInt()

 */

    //val productCard = corporation.ProductCard(brand = brand,name = name,size = size,price = price)
    //productCard.init(name,brand,size,price)
   // productCard.init(brand = brand,name = name,size = size,price = price)//cuando ponemos en orden diferente tenemos que recalcar que pertenece a mismo nombre de variable

    //productCard.printInfo()

    //val assistant = corporation.Assistant()
    //assistant.bringCoffee()

    val consultant = Consultant("Fernando")
    consultant.sayHello()

    val director = Director("Tony", 45)
    val assistant = Assistant("John")
    director.takeCoffee(assistant)
    consultant.clientIsServed()
    director.work(consultant)
}