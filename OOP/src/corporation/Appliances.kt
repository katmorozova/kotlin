package corporation

class Appliances(name: String,
                 brand: String,
                 price: Int,
                 val power: Int
): ProductCard(name, brand, price, ProductType.APPLIANCES) {



    override fun printInfo() {
        super.printInfo()

        println("Power: $power")
    }
}