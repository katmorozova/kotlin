package corporation

class Accountant(
    id: Int,
    name: String,
    age: Int,
    salary: Int
): Worker(id = id, name = name, age = age, salary = salary,WorkerType.ACCOUNTANT), Cleaner, Supplier {


    private val workersRepository = WorkersRepository
    private val productCardsRepository = ProductCardsRepository

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
                OperationType.EXIT -> {
                    workersRepository.saveChanges()
                    productCardsRepository.saveChanges()
                    break
                }
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
        println("Enter name of card for removing: ")
        val name = readln()
       productCardsRepository.removeProductCard(name)
    }

    private fun showAllItems(){
        val cards = productCardsRepository.productCards
        for (card in cards){
            card.printInfo()
        }
    }

    private fun registerNewItem(){
        val productTypes = ProductType.entries
        println("Enter the product type: ")
        for ((index,type) in productTypes.withIndex()){ //cuando queremos obtener tambien index(numero)
            print("$index - ${type.title}")
            if (index < productTypes.size - 1){
                print(", ")
            }else{
                print(": ")
            }
        }
        val productTypeIndex = readln().toInt()
        val productType: ProductType = productTypes[productTypeIndex]

        println("Enter the product name: ")
        val productName = readln()
        println("Enter the brand name: ")
        val productBrand = readln()
        println("Enter price: ")
        val productPrice = readln().toInt()
        val card = when(productType){
            ProductType.FOOD -> {
                println("Enter the caloric: ")
                val caloric = readln().toInt()
                Food(productName, productBrand, productPrice, caloric)
            }
            ProductType.APPLIANCES -> {
                println("Enter the power: ")
                val power = readln().toInt()
                Appliances(productName, productBrand, productPrice, power)
            }
            ProductType.SHOES -> {
                println("Enter the size: ")
                val size = readln().toInt()
                Shoes(productName, productBrand, productPrice, size)
            }
        }
        productCardsRepository.registerNewItem(card)
    }

    private fun showAllWorkers(){
        val workers = workersRepository.employees
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

    override fun copy(salary: Int): Worker {
        return Accountant(this.id, this.name, this.age, this.salary)
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