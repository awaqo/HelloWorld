fun main() {
    var x = true
    var y = false

    println("x && y = " + (x && y))
    println("x || y = " + (x || y))
    println("!y = " + (!y))

    println()
    println()

    val a: Int = 50
    val b: Int = 25
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("a >= b = " + (a >= b))
    println("a <= b = " + (a <= b))
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))

    println()
    println()

    val q: Boolean = true
    val w: Boolean = false
    val e: Boolean = true

    println("q.and(w) = " + q.and(w))
    println("q.and(e) = " + q.and(e))
    println("q.or(w) = " + q.or(w))
}