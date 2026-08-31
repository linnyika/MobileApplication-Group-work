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
    println(
        """
    ===== RENT RECEIPT =====
    Tenant: $name
    House: $houseNumber
    Paid: KES $amountPaid
""".trimIndent()
    )
    val greeting = "Dear Tenant"
    greeting.uppercase()
    println(greeting)

    val outstandingBalance = monthlyRent - amountPaid
    println("Balance: KES$outstandingBalance")

    val percentPaid = (amountPaid / monthlyRent) * 100
    println("Paid: $percentPaid%")
    //Paid: 0% It is wrong
    //since both values are Int Kotlin  performs integer division (20000 / 25000) = 0.
    //0 * 100 = 0

    //way1 avoid integer division by multiplying first
    val percentPaid1 = (amountPaid * 100) / monthlyRent
    println("Paid: $percentPaid1%")
    //Paid: 80%

    //way2 to convert both Int to Doubles then calculate and print answer back as Int
    val percentPaid2 = (amountPaid.toDouble() / monthlyRent.toDouble()) * 100
    println("Paid: ${percentPaid2.toInt()}%")
    //Paid: 80%
    val instalmentAmount = 6000
    val fullInstalments = monthlyRent / instalmentAmount
    val remainingAmount = monthlyRent % instalmentAmount

    println("Full instalments: $fullInstalments")
    println("Remaining amount: KES $remainingAmount")
    //Full instalments: 4
    //Remaining amount: KES 1000

    val totalRent = monthlyRent.times(6) //operators such as * to be written as method calls.
    println("6 month total rent: KES $totalRent")

    val isRentPaid = amountPaid >= monthlyRent
    println("Rent paid $isRentPaid")

    //val monthsInArrears = 2
    val monthsInArrears = 1
    val needsReminder = amountPaid < monthlyRent && monthsInArrears > 1 // && requires both conditions must be true.
    println("Needs reminder $needsReminder")
    // Needs reminder true
    // When monthsInArrears is changed to needsReminder becomes false because the tenant is not more than 1 month in arrears.


    if (outstandingBalance <= 0) {
        println("Rent is fully paid")
    } else {
        println("Rent is outstanding")
    }
    // set to 20000
    // Balance: 5000
    // Rent is outstanding

    // set to 25000
    // Balance: 0
    // Rent is fully paid

    //set to 30000
    // Balance: -5000
    // Rent is fully paid

    if (outstandingBalance <= 0) {
        println("Rent is fully paid")
    } else if (outstandingBalance < 10000) {
        println("Small outstanding balance")
    } else {
        println("Large outstanding balance")
    }

// as a when statement its simpler
    when {
        outstandingBalance <= 0 -> println("Rent is fully paid")
        outstandingBalance < 10000 -> println("Small outstanding balance")
        else -> println("Large outstanding balance")
    }

    val arrearsMonths = 15
    //val arrearsMonths = 8
    //val arrearsMonths = 4
    //val arrearsMonths = 2
    //val arrearsMonths = 0
    when (arrearsMonths) {
        0 -> println("Rent is up to date")
        in 1..2 -> println("Early arrears")
        in 3..5 -> println("Serious arrears")
        in 6..12 -> println("Critical arrears")
        else -> println("Review tenant account")
    }

    val tenantStatus = "ACTIVE"
    //val tenantStatus = "VACATED"
    //val tenantStatus = "PENDING"
    when (tenantStatus) {
        "ACTIVE" -> println("Tenant occupies the house")
        "VACATED" -> println("Tenant has vacated the house")
        "PENDING" -> println("Tenant status is pending")
        else -> println("N/A")

    }
}

