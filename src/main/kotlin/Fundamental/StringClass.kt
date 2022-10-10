fun main() {
    //    Variable
    var companyVar: String = "Infinite Learning"
    companyVar = "Nongsa Digital Park"
    println(companyVar)
    println()
    println()

//    val companyVal: String = "Infinite Learning"
//    companyVal = "Nongsa Digital Park" //--> akan error karena menggunakan val (value tidak dapat diubah)
//    println(companyVal)

    //    Data Type: String
    val stringText = "Kotlin Language"
    val firstChar = stringText[0]
    println("First character of $stringText is $firstChar")
    println()

    val stringText2 = "Kampus Merdeka \nby \"Infinite Learning\""
    println(stringText2)
    println()
    println()

    val stringText3 = """
       Belajar Bahasa Kotlin
       ---------------------
       Di Infinite Learning
       Bersama Kampus Merdeka
    """
    println(stringText3)
}