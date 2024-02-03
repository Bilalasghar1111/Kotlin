data class Employee(val id: Int, var name: String, var position: String, var salary: Double)

class EmployeeManager {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun displayAllEmployees() {
        println("Employee List:")
        employees.forEach { println(it) }
    }

    fun updateEmployeeDetails(id: Int, name: String, position: String, salary: Double) {
        val employee = employees.find { it.id == id }
        if (employee != null) {
            employee.name = name
            employee.position = position
            employee.salary = salary
            println("Employee details updated successfully.")
        } else {
            println("Employee not found.")
        }
    }

    fun removeEmployee(id: Int) {
        val employee = employees.find { it.id == id }
        if (employee != null) {
            employees.remove(employee)
            println("Employee removed successfully.")
        } else {
            println("Employee not found.")
        }
    }
}

fun main() {
    val employeeManager = EmployeeManager()

    while (true) {
        println("\nEmployee Management System")
        println("1. Add Employee")
        println("2. Display All Employees")
        println("3. Update Employee Details")
        println("4. Remove Employee")
        println("5. Exit")

        print("Enter your choice: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Enter employee name: ")
                val name = readLine() ?: ""
                print("Enter employee position: ")
                val position = readLine() ?: ""
                print("Enter employee salary: ")
                val salary = readLine()?.toDoubleOrNull() ?: 0.0

                val newEmployee = Employee((1..1000).random(), name, position, salary)
                employeeManager.addEmployee(newEmployee)
                println("Employee added successfully.")
            }
            2 -> employeeManager.displayAllEmployees()
            3 -> {
                print("Enter employee ID to update: ")
                val id = readLine()?.toIntOrNull() ?: 0
                print("Enter new name: ")
                val name = readLine() ?: ""
                print("Enter new position: ")
                val position = readLine() ?: ""
                print("Enter new salary: ")
                val salary = readLine()?.toDoubleOrNull() ?: 0.0

                employeeManager.updateEmployeeDetails(id, name, position, salary)
            }
            4 -> {
                print("Enter employee ID to remove: ")
                val id = readLine()?.toIntOrNull() ?: 0
                employeeManager.removeEmployee(id)
            }
            5 -> {
                println("Exiting the Employee Management System. Goodbye!")
                return
            }
            else -> println("Invalid choice. Please enter a number between 1 and 5.")
        }
    }
}
