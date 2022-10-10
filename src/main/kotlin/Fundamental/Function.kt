fun main() {
    val hasil = setUser("Aqil", 20)
    println(hasil)
}

fun setUser(name: String, age: Int): String {
    return "Nama kamu adalah $name, dan umur kamu $age tahun"
}