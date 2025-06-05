package corporation

class Shoes (name: String,
             brand: String,
             price: Int,
             val size: Int
        ): ProductCard(name, brand, price, ProductType.SHOES) {



    override fun printInfo() {
        super.printInfo()

        println("Size: $size")
    }
}