package corporation

abstract class Cleaner(
    id: Int,
    name: String,
    age: Int,
    workerType: WorkerType
): Worker(id, name, age, workerType){


    fun clean(){
        println("I'm cleaning workplace")
    }
}