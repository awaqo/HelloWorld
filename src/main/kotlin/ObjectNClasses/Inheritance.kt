package ObjectNClasses
//
//open class Manusia(nama:String, umur: Int? = 0) {
//    var nama = nama
//    fun makan() {
//        println("$nama sedang makan")
//    }
//}
//
//class Murid(nama:String): Manusia(nama) {
//
//}
//
//fun main() {
//    var murid = Murid("Hasan")
//    murid.makan()
//}

open class Manusia(val nama: String, val umur: Int, val beratBadan: Double, val jenisKelamin: Boolean) {
    open fun belajar() {

    }
}