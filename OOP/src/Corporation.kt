fun main() {
    /*
    val assistant: Assistant = Assistant()
    assistant.bringCoffee(5, "cafe con leche")

     */

    println("Input name: ")
    val name = readln()
    println("Input brand: ")
    val brand = readln()
    println("Input size: ")
    val size = readln().toFloat()
    println("Input price: ")
    val price = readln().toInt()

    val productCard = ProductCard(brand = brand,name = name,size = size,price = price)
    //productCard.init(name,brand,size,price)
   // productCard.init(brand = brand,name = name,size = size,price = price)//cuando ponemos en orden diferente tenemos que recalcar que pertenece a mismo nombre de variable

    productCard.printInfo()
}