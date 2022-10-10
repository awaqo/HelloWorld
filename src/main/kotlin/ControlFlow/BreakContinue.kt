fun main() {
    var i = 0
    while (true) {
        println("Break $i")
        i++
        if (i > 5) {
            break
        }
    }
    println()

    val c = 2
    for (b in 1..5){
        println("sayang")
        if (b == c){
            println("putus")
            break
        }
    }
    println()

    println("Print odd numbers")
    for (i in 1..5) {
        if (i % 2 == 0) {
            continue
        }
        println("$i is an odd number")
    }
}