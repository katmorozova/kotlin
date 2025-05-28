package corporation

class Food(name: String,
           brand: String,
           val caloric: Float,
           price: Int
): ProductCard(name, brand, price) {



    override fun printInfo() {
        super.printInfo()
        println("Caloric: $caloric")
    }
}