package corporation

abstract class Worker(
    val id: Int,
    val name: String,
    val age: Int = 0,
    val workerType: WorkerType
    ) {
/*
    open fun work(){
        println("I'm working now ... ")
    }

 */

    abstract fun work()

    open fun printInfo(){
        print("Id: $id Name: $name Age: $age\n")
    }
}