package corporation

class Food(name: String,
           brand: String,
           val caloric: Float,
           price: Int
): ProductCard(name, brand, price) {



    override fun printInfo() {
        super.printInfo()
        println("Enter caloric: ")
        val caloric = readln()
        println("Caloric: $caloric")
    }
}