fun main() {
    /*
    val assistant: Assistant = Assistant()
    assistant.bringCoffee(5, "cafe con leche")

     */

    println("Input name: ")
    var name = readln()
    println("Input brand: ")
    var brand = readln()
    println("Input size: ")
    var size = readln().toFloat()
    println("Input price: ")
    var price = readln().toInt()

    var productCard = ProductCard()
    //productCard.init(name,brand,size,price)
    productCard.init(brand = brand,name = name,size = size,price = price)//cuando ponemos en orden diferente tenemos que recalcar que pertenece a mismo nombre de variable

    productCard.printInfo()
}