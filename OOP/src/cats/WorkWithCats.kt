package cats

fun main() {
    val cat = Cat("Sam")
    println(cat.legsCount)
    println(cat.name)
    cat.eat()
    val lion = Lion(2)
    println(lion.pride)
    cat.playWithMouse()
    lion.eat()


}