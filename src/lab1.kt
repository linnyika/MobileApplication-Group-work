//Concept Note https://docs.google.com/document/d/19Zu5bQ5pdNNXBMe53pin5vM8Z4XmSFAM_e9QGA0UEpA/edit?tab=t.0
//Group 2
//131805 - Abasa Emmanuel
//193344 - Joy Gitau
//191329 - Linda Nyika
//190433 - Grace Mungai
//172066 - Tracy Karuga
//191733 - Derrick Mangeli

// LAB1
fun main() {
    println("----------------------------------------")
    println(" KUPANGWA")
    println("----------------------------------------")
    println("Welcome to Kupangwa!")
    // variables and inputs
    print("Enter group name: ")
    val groupName = readln()
    print("Enter organiser name: ")
    val organiser = readln() ?: ""

    val totalMembers = 4
    val members = mutableListOf<String>()
    members.add(organiser)
    for (index in 2..totalMembers) {
        print("Enter name of member $index: ")
        val member = readln()
        members.add(member)
    }

    println("--------GROUP INFORMATION--------")
    println("Group: $groupName")
    println("Organiser: $organiser")
    println("GROUP MEMBERS")
    println("----------------------------------------")
    println("Members: $totalMembers")
    for (member in members) {
        println("- $member")
    }
    val tasks = mutableListOf(
        "Research",
        "Write Report",
        "Write Code",
        "Compile report and code then submit Report"
    )

    val taskStatuses = mutableListOf(
        "Completed",
        "In Progress",
        "Pending",
        "Pending"
    )
    val taskPoints = mutableListOf(
        15,
        10,
        10,
        10
    )
    // loops and collections
    println("--------GROUP TASKS--------")
    for (index in tasks.indices) {
        println("Task ${index + 1}: ${tasks[index]} Assigned to: ${members[index]}")
        println("Points available: ${taskPoints[index]}")
        println()
    }
    var totalTaskPoints = 0

    for (index in tasks.indices) {
        if (taskStatuses[index] == "Completed") {
            totalTaskPoints += taskPoints[index]
        }
    }
    val currentTask = "Write Report"
    val currentStatus = "In Progress"
    //val currentTask = "Compile report and code then submit Report"
    //val currentStatus = "Completed"

    println("--------TASK STATUS--------")
    println("Task: $currentTask")
    println("Current status: $currentStatus")
    when (currentStatus) {
        "Pending" -> {
            println("Action: Member is yet to accept claim the task.")
        }
        "In Progress" -> {
            println("Action: Member is still working on the task.")
        }
        "Completed" -> {
            println("Action: Submit evidence and request confirmation.")
        }
        else -> {
            println("Action: Status is not recognised.")
        }
    }
    println("--------TASK HANDOVER--------")
    val completedTask = tasks[1]
    val nextTask = tasks[2]
    val nextMember = members[2]
    println("Completed task: $completedTask")
    println("The next responsibility is: $nextTask")
    println("Assigned to: $nextMember")

    if (completedTask == "Research") {
        println("---NOTIFICATION---")
        println("Your turn now, $nextMember! Get started on $nextTask")
    }
    println("--------SUMMARY--------")

    println("Group: $groupName")
    println("Completed task: $completedTask")
    println("Next responsibility: $nextTask")
    println("Next member: $nextMember")
    println("Points earned so far: $totalTaskPoints")
}


