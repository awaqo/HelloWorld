package ObjectNClasses

class Principal() {
    private var studentName = mutableListOf<String>(
        "Student A", "Student B", "Student C"
    )
    fun getStudentName(): List<String>{
        return studentName
    }
}

fun main() {
    val principal = Principal()

//    println(principal.studentName()) --> salah
    println(principal.getStudentName())
}