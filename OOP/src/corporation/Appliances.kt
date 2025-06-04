package corporation

class Appliances(name: String,
                 brand: String,
                 val power: Int,
                 price: Int
): ProductCard(name, brand, price, ProductType.APPLIANCES) {



    override fun printInfo() {
        super.printInfo()

        println("Power: $power")
    }
}