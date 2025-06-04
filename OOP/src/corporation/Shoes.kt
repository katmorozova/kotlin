package corporation

class Shoes (name: String,
             brand: String,
             val size: Int,
             price: Int
        ): ProductCard(name, brand, price, ProductType.SHOES) {



    override fun printInfo() {
        super.printInfo()

        println("Size: $size")
    }
}