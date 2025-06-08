package cats

class Lion(val pride: Int): CatsFamily() {

    override fun eat() {
        print("Estoy comiendo una Antilopa\n")
    }
}