package corporation

import java.io.File

object WorkersRepository {

    private val workersList = File("workers_cards.txt")
    private val _employees = loadAllWorkers()
    val employees

        get() = _employees.toList()

    fun registerNewEmployee(newWorker: Worker){
        //saveWorkerListToFile(worker)
        /*
        for (employee in _employees){
            if (employee == newWorker){
                return
            }
        }
         */
        _employees.add(newWorker)
    }

    fun findAssistant(): Assistant? {
        for (worker in _employees){
            if (worker is Assistant){
                return worker
            }
        }
        //val assistant: Assistant? = null
        //return assistant
        return null
    }

    fun findDirector(): Director? {
        for (worker in _employees){
            if (worker is Director){
                return worker
            }
        }
        return null
    }

    fun changeSalary(id: Int, salary: Int){
        //val workers = loadAllWorkers()
        //workersList.writeText("")//reescribimos texto en file
        for (employee: Worker in _employees){
            if (employee.id == id) {
                //employee.setSalary(salary)
                val newWorker = employee.copy(salary = salary)
                //_employees[index] = newWorker
                _employees.remove(employee)
                _employees.add(newWorker)
                break
            }
            //saveWorkerListToFile(employee)
        }
    }
    fun changeAge(id: Int, age: Int){
        for (employee: Worker in _employees){
            if (employee.id == id) {
                val newWorker = employee.copy(age = age)
                //_employees[index] = newWorker
                _employees.remove(employee)
                _employees.add(newWorker)
                break
            }
        }
    }

/*
    private fun saveWorkerListToFile(worker: Worker) {
        //workersList.appendText("${worker.id}%${worker.name}%${worker.age}%${worker.salary}%${worker.workerType}\n")
        workersList.appendText("${worker.id}%${worker.name}%${worker.age}%${worker.getSalary()}%${worker.workerType}\n")
    }

 */

    fun saveChanges(){
        val content = StringBuilder()
        for (employee in _employees){
            content.append("${employee.id}%${employee.name}%${employee.age}%${employee.salary}%${employee.workerType}\n")
        }
        workersList.writeText(content.toString())
        /*
        workersList.writeText("")
        for (employee in employees){
            saveWorkerListToFile(employee)
        }
         */
    }

    private fun loadAllWorkers(): MutableSet<Worker> {
        //println("loadAllWorkers")

        val workers = mutableSetOf<Worker>()//creado collecion
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
        for (employee in _employees){
            if (employee.id == id) {
                _employees.remove(employee)
                break
            }
        }
    }



}