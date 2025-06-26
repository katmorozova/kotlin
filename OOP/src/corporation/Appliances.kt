package corporation

data class Appliances(
    override val name: String,
    override val brand: String,
    override val price: Int,
                 val power: Int
): ProductCard(name, brand, price, ProductType.APPLIANCES) {


/*
    override fun printInfo() {
        //super.printInfo()
        print(this)
        //println("Power: $power")
    }

 */
/*
    override fun toString(): String {
        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Power: $power\n"
    }

 */
}