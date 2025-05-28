package corporation

class Accountant(name: String, age: Int): Worker(name, age) {

    //val type: Int = readln().toInt()


    override fun work() {
        super.work()

        var item = -1
        while(true){
            println("Enter the operation code: 0 - exit, 1 - register new item:")
            item = readln().toInt()
            when(item){
                0 -> break
                1 -> registerNewItem()

            }
        }
        /*
        do {
            println("\nEnter the operation code: 0 - exit, 1 - register new item:")
            val item = readln().toInt()
            if (item == 0){
                return
            }else if (item == 1){
                println("Enter the product type: 0 - Food, 1 - Appliances, 2 - Shoes:")
                val type = readln().toInt()
                if(type == 0){
                    println("Enter name: ")
                    val name = readln()
                    println("Enter brand: ")
                    val brand = readln()
                    println("Enter caloric: ")
                    val caloric = readln().toFloat()
                    println("Enter price: ")
                    val price = readln()

                    print("Name: $name Brand: $brand Caloric: $caloric Price: $price ")
                } else if (type == 1){
                    println("Enter name: ")
                    val name = readln()
                    println("Enter brand: ")
                    val brand = readln()
                    println("Enter power: ")
                    val power = readln().toFloat()
                    println("Enter price: ")
                    val price = readln()

                    print("Name: $name Brand: $brand Power: $power Price: $price ")
                }else if (type == 2){
                    println("Enter name: ")
                    val name = readln()
                    println("Enter brand: ")
                    val brand = readln()
                    println("Enter size: ")
                    val size = readln().toFloat()
                    println("Enter price: ")
                    val price = readln()

                    print("Name: $name Brand: $brand Size: $size Price: $price ")
                }
            }else{
                println("Numero de operacion desconocido")
            }

        }while (item == 1)

         */

    }


    fun registerNewItem(){
        println("Enter the product type: 0 - Food, 1 - Appliances, 2 - Shoes:")
        val productType = readln().toInt()
        println("Enter the product name: ")
        val productName = readln()
        println("Enter the brand name: ")
        val productBrand = readln()
        println("Enter price: ")
        val productPrice = readln().toInt()
        val card = when(productType){
            0 -> {
                println("Enter the caloric: ")
                val caloric = readln().toInt()
                Food(name = productName,
                    brand = productBrand,
                    caloric = caloric,
                    price = productPrice
                )
            }
            1 -> {
                println("Enter the power: ")
                val power = readln().toInt()
                Appliances(name = productName,
                    brand = productBrand,
                    power = power,
                    price = productPrice
                )
            }
            else -> {
                println("Enter the size: ")
                val size = readln().toInt()
                Shoes(name = productName,
                    brand = productBrand,
                    size = size,
                    price = productPrice
                )
            }
        }
        card.printInfo()
    }
}