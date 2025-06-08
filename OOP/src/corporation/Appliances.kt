package corporation

class Appliances(name: String,
                 brand: String,
                 price: Int,
                 val power: Int
): ProductCard(name, brand, price, ProductType.APPLIANCES) {



    override fun printInfo() {
        //super.printInfo()
        print("Name: $name Brand: $brand Price: $price Product type: ${productType.title} Power: $power\n")
        //println("Power: $power")
    }
}