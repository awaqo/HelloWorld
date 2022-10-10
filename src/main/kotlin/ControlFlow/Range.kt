fun main() {
    val rangeInt = 1..10
    println("Step : " + rangeInt.step)
    print(rangeInt.toList())

    println()
    println()

    val rangeInt2 = 1.rangeTo(20) step 2
    println("Step : " + rangeInt2.step)
    print(rangeInt2.toList())

    println()
    println()

    var i = 4

}