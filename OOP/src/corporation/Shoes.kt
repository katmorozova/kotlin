package corporation

class Shoes (name: String,
             brand: String,
             val size: Float,
             price: Int
        ): ProductCard(name, brand, price) {



    override fun printInfo() {
        super.printInfo()
        println("Size: $size")
    }
}