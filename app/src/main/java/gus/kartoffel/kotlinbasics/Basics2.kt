package gus.kartoffel.kotlinbasics

fun main(){
    // val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    // val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    // println(numbers.contentToString())
    for(element in numbers){
        println("$element")
    }
    println(numbers[3])
    numbers[0] = 10
    numbers[1] =11
    for(element in numbers){
        println("$element")
    }
    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Orange", 1.5))
    println(fruits.contentToString())
    for(index in fruits.indices){
        println("${fruits[index].name} is in index $index")
    }
    for(fruits in fruits){
        println("${fruits.name}")
    }

    val mix = arrayOf(1,2,3,"Mon","Fri","Tue", Fruit("Apple", 2.5))
    println(mix.contentToString())
}

data class Fruit(val name: String, val price: Double)

