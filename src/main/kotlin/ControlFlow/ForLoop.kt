fun main() {
    for (i in 1..5) {
        println("Value is $i")
    }

    println()

    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    for (day in days) {
        println(day)
    }
    println()
    for ((index, value) in days.withIndex()) {
        println("value $value with $index")
    }
    println()
    days.forEach { value ->
        println("Day is $value")
    }
    println()
    days.forEachIndexed { index, value ->
        println("Day $value with index: $index")
    }
}