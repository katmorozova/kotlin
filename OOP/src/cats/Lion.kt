package cats

class Lion(val pride: Int): CatsFamily() {

    override fun eat() {
        super.eat()
        print("Antilopa\n")
    }
}