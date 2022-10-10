package ObjectNClasses

abstract class Human(val name: String) {
    abstract var age: Int
    abstract var dateOfBirth: String

    fun humanDetails() {
        println("Name of the human : $name")
        println("Age : $age")
    }
}

class Student(name: String) : Human(name) {
    override var age = 21
    override var dateOfBirth = ""
}

fun main() {
    val eng = Student("Aqil Jawadal")
    eng.humanDetails()
}