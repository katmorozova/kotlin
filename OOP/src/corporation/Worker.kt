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
        print(this)
    }

    override fun toString(): String {
        return "Id: $id Name: $name Age: $age Worker type: $workerType\n"
    }
}