package corporation

class Accountant(name: String, age: Int): Worker(name, age) {

    //val type: Int = readln().toInt()


    override fun work() {
        super.work()

        val operationTypes = OperationType.entries
        while(true){
            print("Enter the operation type: ")
            for ((index,type) in operationTypes.withIndex()){ //cuando queremos obtener tambien index(numero)
                print("$index - ${type.title}")
                if (index < operationTypes.size){
                    print(", ")
                }else{
                    print(": ")
                }
            }
            val operationIndex = readln().toInt()
            val operationType = operationTypes[operationIndex]
            when(operationType){
                OperationType.EXIT -> break
                OperationType.REGISTER -> registerNewItem()
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
        val productTypes = ProductType.entries

        //println("Enter the product type: 0 - ${productTypes[0].title}, 1 - ${productTypes[1].title}, 2 - ${productTypes[2].title}:")
        val productTypeIndex = readln().toInt()
        val productType: ProductType = productTypes[productTypeIndex]

        println("Enter the product name: ")
        val productName = readln()
        println("Enter the brand name: ")
        val productBrand = readln()
        println("Enter price: ")
        val productPrice = readln().toInt()
        val card = when(productType){


            /*
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

             */
            ProductType.FOOD -> {
                println("Enter the caloric: ")
                val caloric = readln().toInt()
                Food(name = productName,
                    brand = productBrand,
                    caloric = caloric,
                    price = productPrice
                )
            }
            ProductType.APPLIANCES -> {
                println("Enter the power: ")
                val power = readln().toInt()
                Appliances(name = productName,
                    brand = productBrand,
                    power = power,
                    price = productPrice
                )
            }
            ProductType.SHOES -> {
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