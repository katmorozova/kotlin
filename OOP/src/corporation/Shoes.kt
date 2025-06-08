package corporation

class Shoes (name: String,
             brand: String,
             price: Int,
             val size: Int
        ): ProductCard(name, brand, price, ProductType.SHOES) {



    override fun printInfo() {
        //super.printInfo()
        print("Name: $name Brand: $brand Price: $price Product type: ${productType.title} Size: $size\n")
        //println("Size: $size")
    }
}