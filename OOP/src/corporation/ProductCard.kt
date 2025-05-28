package corporation

open class ProductCard(
    val name: String,
    val brand: String,
    val price: Int
) {
    /*
    val name: String
    val brand: String
    val size: Float
    val price: Int

     */
/*
    constructor(name: String, brand: String, size: Float, price:Int){
        this.name = name
        this.brand = brand
        this.size = size
        this.price = price
    }

 */



/*
//metodo para inicilizacion:
    fun init(name: String, brand: String, size: Float, price:Int){
        this.name = name
        this.brand = brand
        this.size = size
        this.price = price
    }

 */

    open fun printInfo(){
       /*
        println("Name: ${this.name}" +
                "\nBrand: ${this.brand}" +
                //"\nSize: ${this.size} " +
                "\nPrice: ${this.price}"
        )

        */

        //println("Name: $name Brand: $brand Size: $size Price: $price")
        print("Name: $name Brand: $brand Price: $price ")
    }
}