package corporation

import java.io.File

class WorkersRepository {


    private val employees = loadAllWorkers()
    private val workersList = File("workers_cards.txt")

    fun registerNewEmployee(worker: Worker){
        //saveWorkerListToFile(worker)
        employees.add(worker)
    }

    fun changeSalary(id: Int, salary: Int){
        //val workers = loadAllWorkers()
        //workersList.writeText("")//reescribimos texto en file
        for (employee in employees){
            if (employee.id == id) {
                employee.setSalary(salary)
            }
            //saveWorkerListToFile(employee)
        }
    }


    private fun saveWorkerListToFile(worker: Worker) {
        //workersList.appendText("${worker.id}%${worker.name}%${worker.age}%${worker.salary}%${worker.workerType}\n")
        workersList.appendText("${worker.id}%${worker.name}%${worker.age}%${worker.getSalary()}%${worker.workerType}\n")
    }

    fun loadAllWorkers(): MutableList<Worker> {
        val workers = mutableListOf<Worker>()//creado collecion
        if(!workersList.exists()) workersList.createNewFile()

        val content = workersList.readText().trim()

        if (content.isEmpty()) return workers

        val listsAsString = content.split("\n")
        for (listAsString in listsAsString) {
            val properties = listAsString.split("%")
            val id = properties[0].toInt()
            val name = properties[1]
            val age = properties[2].toInt()
            val salary = properties[3].toInt()
            val positionAsText = properties.last()
            val workerType = WorkerType.valueOf(positionAsText)
            val worker = when (workerType) {
                WorkerType.DIRECTOR -> Director(id, name, age, salary)
                WorkerType.ACCOUNTANT -> Accountant(id, name, age, salary)
                WorkerType.ASSISTANT -> Assistant(id, name, age, salary)
                WorkerType.CONSULTANT -> Consultant(id, name, age, salary)
            }
            //worker.salary = salary
            //worker.setSalary(salary)
            workers.add(worker)
        }
        return workers
    }

    fun fireWorker(id:Int){
        //val workers = loadAllWorkers()
        //workersList.writeText("")//reescribimos texto en file
        for (employee in employees){
            if (employee.id == id) {
                employees.remove(employee)
                break
            }
        }
    }



}