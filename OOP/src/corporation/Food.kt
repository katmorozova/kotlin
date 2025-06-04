package corporation

class Food(name: String,
           brand: String,
           val caloric: Int,
           price: Int
): ProductCard(name, brand, price, ProductType.FOOD) {



    override fun printInfo() {
        super.printInfo()

        println("Caloric: $caloric")
    }
}