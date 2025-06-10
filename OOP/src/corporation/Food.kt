package corporation

class Food(name: String,
           brand: String,
           price: Int,
           val caloric: Int
): ProductCard(name, brand, price, ProductType.FOOD) {


/*
    override fun printInfo() {
        //super.printInfo()
        print(this)
        //println("Caloric: $caloric")
    }

 */

    override fun toString(): String {
        return "Name: $name Brand: $brand Price: $price Product type: ${productType.title} Caloric: $caloric\n"
    }
}