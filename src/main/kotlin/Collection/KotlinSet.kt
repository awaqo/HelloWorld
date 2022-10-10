package Collection

fun main() {
    println("setof & mutablesetof")
    val setA = setOf(1,2,4,2,1,5)
    val setB = mutableSetOf(1,2,4,5)
    println(setA == setB)
//    pada setOf tidak bisa edit, hanya bisa add & remove
    println()

    println("in")
    val setData = setOf(1,2,4,2,1,5)
    println(4 in setData)
    println()

    println("union & intersect")
    val list1 = listOf(1,1,2,3,5,8,-1)
    val list2 = setOf(1,1,2,2,3,5)
    val list3 = mutableSetOf(6,7)

    val  intersect = list1 intersect list2
    val union = list1 union list2 union list3

    println("Intersect : " + intersect)
    println("Union : " + union)
}