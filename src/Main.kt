//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Welcome to the Tenant Management System")

    val tenantId = 1001 //the tenant id does not change
   // tenantId = 1002
    // Error is that 'val' cannot be reassigned. The compiler refused because tenantId was declared and could not be reassigned. Changing the val to var would make it compile.
    val name = "Jane Wanjiku" //it is val because we are not changing the name in the task
    val phone = "0712345678" //val because the number is not being updated
    val houseNumber = "A-204" // the house no is not being changed in the task
    val monthlyRent = 25000 // not being changed in the task
    var amountPaid = 15000 // the value can change when the tenant makes another payment
    println("Amount paid before: $amountPaid")
    amountPaid = amountPaid + 5000
    println("Amount paid after: $amountPaid")

    //Derrick Tuta
    val block: Char = 'A'
    val isActive: Boolean = true
    val rentAsDouble: Double = monthlyRent.toDouble()
    val registrationNumber: Long = 999_999_999L
    println(registrationNumber)
    println(name + " lives in house " + houseNumber)
    println("$name lives in house $houseNumber")
    println("Total rent for 6 months: KES ${monthlyRent * 6}")
    println("""
    ===== RENT RECEIPT =====
    Tenant: $name
    House: $houseNumber
    Paid: KES $amountPaid
""".trimIndent())
    val greeting = "Dear Tenant"
    greeting.uppercase()
    println(greeting)

}
