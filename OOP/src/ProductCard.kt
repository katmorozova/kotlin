class ProductCard {
    var name: String = ""
    var brand: String = " "
    var size: Float = 0f
    var price: Int = 0

//metodo para inicilizacion:
    fun init(name: String, brand: String, size: Float, price:Int){
        this.name = name
        this.brand = brand
        this.size = size
        this.price = price
    }

    fun printInfo(){
        println("Name: ${this.name}" +
                "\nBrand: ${this.brand}" +
                "\nSize: ${this.size} " +
                "\nPrice: ${this.price}"
        )

        println("Name: $name Brand: $brand Size: $size Price: $price")
    }
}