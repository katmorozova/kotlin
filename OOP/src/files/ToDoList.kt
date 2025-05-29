package files

import corporation.OperationType
import java.io.File

fun main() {
    //val file = File("toDo.txt")

    val operationCodes = OperationCode.entries
    while(true){
        print("Enter the operation type: ")
        for ((index,type) in operationCodes.withIndex()){ //cuando queremos obtener tambien index(numero)
            print("$index - ${type.title}")
            if (index < operationCodes.size){
                print(": ")
            }else{
                print(", ")
            }
        }
        val operationIndex = readln().toInt()
        val operationCode = operationCodes[operationIndex]
        when(operationCode){
            OperationCode.EXIT -> break
            OperationCode.REGISTER -> registerNewItem()
            OperationCode.SHOW_ALL_ITEMS -> showAllItems()

        }

    }

}
    fun registerNewItem() {
        val file = File("toDo.txt")
        while (true) {
            println("Enter a new item or 0 to exit: ")
            val item = readln()
            if (item == "0") {
                break
            }
            file.appendText("$item\n")
        }
    }

    fun showAllItems() {
        val file = File("toDo.txt")
        val content = file.readText().trim()
        val items = content.split("\n")
        for ((index, item) in items.withIndex()){
            println("$index - $item")
        }

    }