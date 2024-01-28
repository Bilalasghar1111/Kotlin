Iterating over a collection of class instances:
class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 25), Person("Bob", 30), Person("Charlie", 28))

for (person in people) {
    println("$person.name is $person.age years old.")
}
