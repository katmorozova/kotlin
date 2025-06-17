package corporation

abstract class Worker(
    val id: Int,
    val name: String,
    val age: Int = 0,
    val salary: Int = 15000,
    val workerType: WorkerType
    ) {

    abstract fun copy(salary: Int): Worker
/*
    fun getSalary():Int = this.salary

    fun setSalary(salary: Int){
        if (salary < this.salary){
            println("The new salary is too small... ")
        }else {
            this.salary = salary
        }
    }

 */
    //var salary: Int = 15000
/*
        set(value) {
            if (value < field){
                println("The new salary is too small... ")
            }else {
                field = value
            }
        }
        get() {
            return field
        }

 */
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
        return "Id: $id Name: $name Age: $age Worker type: $workerType Salary: $salary\n"
    }
}