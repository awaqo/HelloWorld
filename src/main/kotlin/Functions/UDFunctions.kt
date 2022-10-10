package Functions

fun main() {
    printCompany()
    println()

    val color = "yellow"
    turnOnLight(color)
    println()

    println(factorial(4))
}

fun printCompany() {
    println("Infinite Learning")
}

fun turnOnLight(color:String) {
    println("$color light is on")
//    return "$color light is on"
}

fun factorial(n:Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
//        var result = 1
//        for (i in 1..n) {
//            result *= i
//        }
//        result
    }
}