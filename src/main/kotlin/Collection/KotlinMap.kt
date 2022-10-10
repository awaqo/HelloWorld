package Collection

fun main() {
    println("Imutable map of")
    val groupMap = mapOf(
        1 to "Group 1",
        2 to "Group 2",
        3 to "Group 3",
        4 to "Group 4",
        5 to "Group 5",
        6 to "Group 6",
        7 to "Group 3",
    )
    println("Show all key & values : " + groupMap)
    println("Show by index : " + groupMap[3])
    println("Show by key : " + groupMap.getValue(3))
    println("Show values only : " + groupMap.values)
    println("Show keys only : " + groupMap.keys)
    println()

    println("imutable to mutable")
    val mutableGroupMap = groupMap.toMutableMap()
    println(mutableGroupMap)
    mutableGroupMap[1] = "Group Satu"
    mutableGroupMap.put(8, "Group 8")
    println(mutableGroupMap)

}