package cats

fun main() {
    val cat = Cat("Sam")
    println(cat.legsCount)
    println(cat.name)
    val lion = Lion(5)
    println(lion.pride)
    cat.playWithMouse()


}