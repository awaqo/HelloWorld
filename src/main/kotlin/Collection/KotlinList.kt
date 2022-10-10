package Collection

fun main() {
    val numberList = mutableListOf("One", "Two", "Three")
    println(numberList)

    numberList[0] = "1"
    numberList.set(2, "Tiga")
    numberList.add("Four")
    println(numberList)

    println()
    println()

    val numberList2 = mutableListOf(false, "One", 2, 3.5)
    println(numberList2)

    numberList2.remove(false)
    numberList2.set(0, 1)
    numberList2[2] = 3
    numberList2.add(3, 4)
    println(numberList2)
}