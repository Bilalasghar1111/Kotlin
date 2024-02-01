import java.util.*

data class BankAccount(val accountNumber: Int, var balance: Double = 0.0)

class BankManagementSystem {
    private val accounts = mutableListOf<BankAccount>()
    private var accountCounter = 1

    fun createAccount() {
        val account = BankAccount(accountCounter++)
        accounts.add(account)
        println("Account created successfully. Account Number: ${account.accountNumber}")
    }

    fun deposit(accountNumber: Int, amount: Double) {
        val account = findAccount(accountNumber)
        if (account != null) {
            account.balance += amount
            println("Deposit successful. New balance: ${account.balance}")
        } else {
            println("Account not found.")
        }
    }

    fun withdraw(accountNumber: Int, amount: Double) {
        val account = findAccount(accountNumber)
        if (account != null) {
            if (account.balance >= amount) {
                account.balance -= amount
                println("Withdrawal successful. New balance: ${account.balance}")
            } else {
                println("Insufficient funds.")
            }
        } else {
            println("Account not found.")
        }
    }

    fun checkBalance(accountNumber: Int) {
        val account = findAccount(accountNumber)
        if (account != null) {
            println("Account Number: ${account.accountNumber}, Balance: ${account.balance}")
        } else {
            println("Account not found.")
        }
    }

    private fun findAccount(accountNumber: Int): BankAccount? {
        return accounts.find { it.accountNumber == accountNumber }
    }
}

fun main() {
    val bankSystem = BankManagementSystem()
    
    // Example usage
    bankSystem.createAccount()
    bankSystem.deposit(1, 1000.0)
    bankSystem.withdraw(1, 500.0)
    bankSystem.checkBalance(1)
}
