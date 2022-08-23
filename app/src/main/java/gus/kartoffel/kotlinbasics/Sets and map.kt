package gus.kartoffel.kotlinbasics

fun main(){
    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Mango", "Orange")
    // println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    // println(newFruits)
    println(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday") //Map connects the Key to it's internal value. Key can be most anything
    println(daysOfTheWeek[2]) // Key not index
    for(key in daysOfTheWeek.keys){
        println("$key is connected to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruits("Grape", 2.5), "Awesome" to Fruits("Apple", 1.5))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    println(fruitsMap.toSortedMap())
}

data class Fruits(val name: String, val price: Double)