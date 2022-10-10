fun main() {
    val day = 1

    var result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println(result)
    println()

    val dayy = 7
    when (dayy) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }
}