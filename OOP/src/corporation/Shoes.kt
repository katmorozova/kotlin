package corporation

data class Shoes (
    override val name: String,
    override val brand: String,
    override val price: Int,
    val size: Int
        ): ProductCard(name, brand, price, ProductType.SHOES) {


/*
    override fun printInfo() {
        //super.printInfo()
        print(this)
        //println("Size: $size")
    }

 */
/*
    override fun toString(): String {
        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Size: $size\\n"
    }

 */
}