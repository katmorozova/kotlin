package cats

class Cat(val name: String): CatsFamily() {

    fun playWithMouse(){
        println("I'm playing with mouse")
    }

    override fun eat() {
        super.eat()
        print("Wiskas\n")
    }
}