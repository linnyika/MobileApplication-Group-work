class Tenant(
    val name: String,
    val apartmentNumber: Int,
    initialRentAmount: Double
) {
    //task 1 - properties
    var isPaid: Boolean = false

    //task 3 - custom setter
    //task 4 - custom getter
    //use backing field (field) to store the actual rent value safely
    var rentAmount: Double = initialRentAmount
        get() {
            //task 4 - getter runs every time the property is READ (accessed)
            println("Rent amount accessed.")
            return field
        }
        set(value) {
            //task 3 - validation logic inside setter
            if (value >= 0) {
                field = value
            } else {
                println("Error, rent amount cannot be negative.")
            }
        }
    //task 1 - function to pay rent
    fun payRent() {
        isPaid = true
        println("Rent has been paid successfully by $name")
    }
}

//task 5 - Apartment class, introduces composition (an Apartment is made up of Tenants)
class Apartment(
    val apartmentNumber: Int,
    val tenants: MutableList<Tenant> = mutableListOf()
) {
    //task 5 - function to add a tenant to this apartment
    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }

    //task 5 - function to list all tenants in this apartment
    fun listTenants() {
        println("Tenants in Apartment $apartmentNumber:")
        for (tenant in tenants) {
            println("- ${tenant.name}, Paid: ${tenant.isPaid}")
        }
    }
}

//main function
fun main() {

    println("---tests---")

    //task 2 - creating two tenant objects using the primary constructor
    val tenant1 = Tenant("Jane Wanjiku", 101, 25000.0)
    val tenant2 = Tenant("Brian Otieno", 102, 20000.0)

    //task 2 - call payRent for only one tenant
    tenant1.payRent()

    //task 2 - display payment status for both tenants
    println("${tenant1.name} payment status:${tenant1.isPaid}")
    println("${tenant2.name} payment status:${tenant2.isPaid}")

    //TASK 1 COMMENT
    /*Each object created from a class is a separate instance
    in memory with its own unique state and independent set of property values
     */

    //TASK 2 COMMENT
    /*Passing information through a constructor when creating an object
    ensures that an object is created in a valid, fully initialized state
    from the moment it is instantiated, eliminated and avoiding missing or uninitialized property errors
     */

    //task 3
    println("/n---tests---")

    //create tenant with a valid rent amount
    val tenant3 = Tenant("Mary Achieng", 201, 15000.0)
    println("Initial rent for ${tenant3.name}: KES${tenant3.rentAmount}")

    //changing the tenant's rent to a negative value
    println("setting rent to -5000.0...")
    tenant3.rentAmount = -5000.0

    //prtint rent amount to confirm the negative value was rejected
    println("Rent after invalid update: KES${tenant3.rentAmount}")

    //TASK 3 COMMENT
    /*it is useful to validate a value before allowing it to be stored in an object because encapsulation and
    data validation prevent impossible data, like negatives, from entering
    the system
     */

    //task 4
    println("/n---task 4 tests---")
    println(tenant3.rentAmount) // triggers the getter, prints "Rent amount accessed." before showing the value

    //TASK 4 COMMENT
    /*The getter is executed every time the property is read/accessed, e.g. println(tenant.rentAmount).
    The setter is executed every time a new value is assigned to the property, e.g. tenant.rentAmount = 5000.0.
    Getting a property retrieves its current value; setting a property changes/stores a new value.
     */

    //task 5
    println("/n---task 5 tests---")
    val apartmentA = Apartment(101)
    apartmentA.addTenant(tenant1)
    apartmentA.addTenant(tenant2)
    apartmentA.listTenants()
}
