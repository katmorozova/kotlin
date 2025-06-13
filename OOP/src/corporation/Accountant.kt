package corporation

import java.io.File

class Accountant(id: Int, name: String, age: Int, salary: Int): Worker(id, name, age, salary,WorkerType.ACCOUNTANT), Cleaner, Supplier {


    private val workersRepository = WorkersRepository()
    private val file = File("product_cards.txt")

    override fun clean() {
        println("My position is Accountant. I'm cleaning workplace...")
    }

    override fun buyThings() {
        println("My position is ${WorkerType.ACCOUNTANT}. I'm buying things...")
    }

    override fun work() {
        val operationTypes = OperationType.entries
        while(true){
            print("Enter the operation type:\n ")
            for ((index,type) in operationTypes.withIndex()){ //cuando queremos obtener tambien index(numero)
                print("$index - ${type.title}")
                if (index < operationTypes.size){
                    print(":\n")
                }else{
                    print(",\n ")
                }
            }
            val operationIndex = readln().toInt()
            val operationType = operationTypes[operationIndex]
            when(operationType){
                OperationType.EXIT -> break
                OperationType.REGISTER -> registerNewItem()
                OperationType.SHOW_ALL_ITEMS -> showAllItems()
                OperationType.REMOVE_PRODUCT_CARD -> removeProductCard()
                OperationType.REGISTER_NEW_EMPLOYEE -> registerNewWorker()
                OperationType.FIRE_EMPLOYEE -> fireWorker()
                OperationType.SHOW_ALL_EMPLOYEES -> showAllWorkers()
                OperationType.CHANGE_SALARY -> changeSalary()
            }
        }
    }


    private fun removeProductCard(){
        val cards: MutableList<ProductCard> = loadAllCards()
        println("Enter name of card for removing: ")
        val name = readln()
        /*
        for ((index, card) in cards.withIndex()){
            if (card.name == name){
                cards.removeAt(index)
                break
            }
        }
         */
        for (card in cards){
            if (card.name == name) {
                cards.remove(card)
                break
            }
        }
        file.writeText("")//reescribimos texto en file
        for (card in cards){
            saveProductCardToFile(card)
        }
    }

    private fun saveProductCardToFile(productCard: ProductCard){
        file.appendText("${productCard.name}%${productCard.brand}%${productCard.price}%")
        when (productCard) {
            is Food -> { //Comprobamos si pertenece a tipo Food
                //productCard.caloric //hacemos down-cast
                val caloric = readln().toInt()
                //file.appendText("$caloric%${ProductType.FOOD}\n")
                file.appendText("$caloric%")
            }
            is Shoes -> {
                val size = readln().toInt()
                //file.appendText("$size%${ProductType.SHOES}\n")
                file.appendText("$size%")
            }
            is Appliances -> {
                val power = readln().toInt()
                //file.appendText("$power%${ProductType.APPLIANCES}\n")
                file.appendText("$power%")
            }
        }
        file.appendText("${productCard.productType}\n")
    }

    private fun loadAllCards(): MutableList<ProductCard> {
        val cards: MutableList<ProductCard> = mutableListOf<ProductCard>()//creado collecion de los productCards
       //Coger los datos desde product_card.txt y separarles por el simbolo \n
        val content = file.readText().trim()

        if (content.isEmpty()){
            return cards
        }

        val cardsAsString = content.split("\n")
        for(cardAsString in cardsAsString){
            val properties = cardAsString.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            //val type = properties[properties.size -1]
            val type = properties.last()
            val productType = ProductType.valueOf(type)
            val productCard = when(productType){
                ProductType.FOOD -> {
                    val caloric = properties[3].toInt()
                    Food(name, brand,caloric, price)
                }
                ProductType.APPLIANCES -> {
                    val power = properties[3].toInt()
                    Appliances(name, brand, power, price)

                }
                ProductType.SHOES -> {
                    val size = properties[3].toInt()
                    Shoes(name, brand, size, price)

                }
            }
            cards.add(productCard)
        }
        return cards
    }

    private fun showAllItems(){
        val cards = loadAllCards()
        for (card in cards){
            card.printInfo()
        }
    }

    private fun registerNewItem(){
        val productTypes = ProductType.entries
        println("Enter the product type: ")
        for ((index,type) in productTypes.withIndex()){ //cuando queremos obtener tambien index(numero)
            print("$index - ${type.title}")
            if (index < productTypes.size){
                print(": ")
            }else{
                print(", ")
            }
        }
        val productTypeIndex = readln().toInt()
        val productType: ProductType = productTypes[productTypeIndex]

        println("Enter the product name: ")
        val productName = readln()
        //file.appendText("$productName%")
        println("Enter the brand name: ")
        val productBrand = readln()
        //file.appendText("$productBrand%")
        println("Enter price: ")
        val productPrice = readln().toInt()
        //file.appendText("$productPrice%")
        //ProductType.valueOf("FOOD")
        //val card = when(productType){
        val card = when(productType){
            ProductType.FOOD -> {
                println("Enter the caloric: ")
                val caloric = readln().toInt()
                file.appendText("$caloric%")
                Food(productName, productBrand, productPrice, caloric)
            }
            ProductType.APPLIANCES -> {
                println("Enter the power: ")
                val power = readln().toInt()
                file.appendText("$power%")
                Appliances(productName, productBrand, productPrice, power)
            }
            ProductType.SHOES -> {
                println("Enter the size: ")
                val size = readln().toInt()
                file.appendText("$size%")
                Shoes(productName, productBrand, productPrice, size)
            }
        }
        saveProductCardToFile(card)
    }

    private fun showAllWorkers(){
        val workers = workersRepository.loadAllWorkers()
        for (worker in workers){
            worker.printInfo()
        }
    }

    private fun registerNewWorker(){
        val workerTypes = WorkerType.entries
        println("Choose position: ")
        for ((index,workerType) in workerTypes.withIndex()){ //cuando queremos obtener tambien index(numero)
            print("$index - ${workerType.title}")
            if (index < workerTypes.size - 1){
                print(": ")
            }else{
                print(", ")
            }
        }
        val workerTypeIndex = readln().toInt()
        val workerType = workerTypes[workerTypeIndex]

        println("Enter worker´s id: ")
        val id = readln().toInt()
        println("Enter worker´s name: ")
        val name = readln()
        println("Enter worker´s age: ")
        val age = readln().toInt()
        println("Enter worker´s salary: ")
        val salary = readln().toInt()

        val worker = when(workerType){
            WorkerType.DIRECTOR -> Director(id, name, age, salary)
            WorkerType.ACCOUNTANT -> Accountant(id, name, age, salary)
            WorkerType.ASSISTANT -> Assistant(id, name, age, salary)
            WorkerType.CONSULTANT -> Consultant(id, name, age, salary)
        }
        workersRepository.registerNewEmployee(worker)
    }

    private fun fireWorker(){
        println("Enter id for fire a worker: ")
        val id = readln().toInt()
        workersRepository.fireWorker(id)
    }

    private fun changeSalary(){
        println("Enter worker's id to change salary: ")
        val id = readln().toInt()
        println("Enter new salary: ")
        val salary = readln().toInt()
        workersRepository.changeSalary(id,salary)
    }
}