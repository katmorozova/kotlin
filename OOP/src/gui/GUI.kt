package gui

fun main() {
    val rectangle: Rectangle = Rectangle(10,4)
    //rectangle.draw()
    println(rectangle.area)
    rectangle.height = 10
    println(rectangle.area)
}