package Collection

fun main() {
    val numberList = listOf(1,2,3,4,5)
    val eventList = numberList.filter { it % 2 == 0 }
    val notEventList = numberList.filterNot { it % 2 == 0 }
    val multipliedBy5 = numberList.map { it * 5 }

    println("Number List : " + numberList)
    println("Filter : " + eventList)
    println("Filter Not : " + notEventList)
    println("Map : " + multipliedBy5)
    println()

    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val totalDays = days.count()
    println("Count : " + totalDays)
    println()


    val numberList2 = listOf(1,2,3,4,5,6,7,8,9,10)
    val oddNumber = numberList2.find { it % 2 == 1 }
    val firstOrNullNumber = numberList2.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList2.lastOrNull { it % 2 == 1 }

    println("Number List 2 : " + numberList2)
    println(oddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)
    println()

    val firstData = days.first()
    val latestData = days.last()
    println("First Day : " + firstData)
    println("Last Day : " + latestData)
    println()

    val sumData = numberList2.sum()
    println("Sum data Number List 2 : " + sumData)
    println()

    val hackerChar = listOf('h', 'a', 'c', 'k', 'e', 'r')

    val ascendingSort1 = numberList.sorted()
    val ascendingSort2 = numberList.sorted()

    println("Sort Ascending Number List 1 : " + ascendingSort1)
    println("Sort Ascending Char : " + ascendingSort2)
}