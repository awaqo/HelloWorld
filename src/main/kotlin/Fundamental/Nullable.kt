val name = "Aqil"
val room = 2
var dateOut: String? = null
var status = "Booked"

fun main() {
    val safeText: String? = null
    val safeTextLength = safeText?.length ?: "kosong"
    println(safeTextLength)
    println()
    println()

    println(cekGuest())
    println()
    status = "Checkout"
    if(status.equals("Checkout")) {
        dateOut = "29/09/2022 11:07:30"
    }
    println(cekGuest())
}

fun cekGuest(): String {
    return "Nama : $name \nCheckout : $dateOut"
}