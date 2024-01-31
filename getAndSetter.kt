class Person {
    // Properties
    var firstName: String = ""
        get() {
            println("Getting firstName")
            return field
        }
        set(value) {
            println("Setting firstName to $value")
            field = value
        }

    var lastName: String = ""
        get() {
            println("Getting lastName")
            return field
        }
        set(value) {
            println("Setting lastName to $value")
            field = value
        }

    // Custom Getter for Full Name
    val fullName: String
        get() = "$firstName $lastName"
}

fun main() {
    // Create an instance of the Person class
    val person = Person()

    // Use custom setters and getters
    person.firstName = "Bilal"
    person.lastName = "Asghar"

    println("Full Name: ${person.fullName}")
}
