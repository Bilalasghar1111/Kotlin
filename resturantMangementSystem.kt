data class MenuItem(val name: String, val price: Double)

class Order(var items: List<MenuItem> = listOf()) {
    fun addItem(item: MenuItem) {
        items = items + item
    }

    fun calculateTotal(): Double {
        return items.sumByDouble { it.price }
    }

    fun displayOrder() {
        println("Order:")
        items.forEach { println("${it.name} - $${it.price}") }
        println("Total: $${calculateTotal()}")
    }
}

class Restaurant {
    val menu = mutableListOf(
        MenuItem("Burger", 9.99),
        MenuItem("Pizza", 12.99),
        MenuItem("Salad", 7.99)
    )

    fun displayMenu() {
        println("Menu:")
        menu.forEach { println("${it.name} - $${it.price}") }
    }

    fun placeOrder(order: Order) {
        println("Order placed successfully!")
        order.displayOrder()
    }
}

fun main() {
    val restaurant = Restaurant()

    // Display the menu
    restaurant.displayMenu()

    // Create an order
    val order = Order()
    order.addItem(restaurant.menu[0])
    order.addItem(restaurant.menu[2])

    // Place the order
    restaurant.placeOrder(order)
}
