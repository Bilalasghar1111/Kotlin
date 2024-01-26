import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Simple Calculator in Kotlin")

    while (true) {
        print("Enter the first number: ")
        val num1 = scanner.nextDouble()

        print("Enter the second number: ")
        val num2 = scanner.nextDouble()

        print("Choose an operation (+, -, *, /): ")
        val operator = scanner.next()

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 != 0.0) {
                    num1 / num2
                } else {
                    println("Error: Division by zero!")
                    continue
                }
            }
            else -> {
                println("Error: Invalid operator!")
                continue
            }
        }

        println("Result: $result")

        print("Do you want to perform another calculation? (yes/no): ")
        val choice = scanner.next().toLowerCase()

        if (choice != "yes") {
            break
        }
    }

    println("Calculator closed.")
}
