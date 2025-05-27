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
/*
    val consultant: Worker = Consultant("Max", 34)
    (consultant as Consultant).sayHello()

    val director: Worker = Director("Tony", 45)
    val assistant: Worker = Assistant("John")
    (assistant as Assistant).bringCoffee()
    (director as Director).takeCoffee(assistant as Assistant)
    consultant.clientIsServed()
    director.work(consultant)
 */

    val director: Director = Director("Tony", 45)
    val consultant: Consultant = Consultant("Max", 34)
    val assistant: Assistant = Assistant("John")

   // val employees = listOf<Any>(director, consultant, assistant, "Hello")//todos los clases en Kotlin se heredan de clase Any
    val employees = listOf<Worker>(director, consultant, assistant)
    for(employee in employees){
        employee.work()
    }

}