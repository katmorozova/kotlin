package corporation

data class Food(
    override val name: String,
    override val brand: String,
    override val price: Int,
           val caloric: Int
): ProductCard(name, brand, price, ProductType.FOOD) {


/*
    override fun printInfo() {
        //super.printInfo()
        print(this)
        //println("Caloric: $caloric")
    }

 */
/*
    override fun toString(): String {
        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Caloric: $caloric\n"
    }

 */
}