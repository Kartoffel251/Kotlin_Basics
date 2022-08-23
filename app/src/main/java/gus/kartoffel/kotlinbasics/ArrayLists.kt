package gus.kartoffel.kotlinbasics

fun main(){
    /*
     ArrayList are used to create a dynamic array. This means that the size of the ArrayList can be increased or decreased according to requirements

     the ArrayList class provides read and write functionalities

     it follows the sequence of insertion code

     it's not synchronized and may contain duplicates
     */

    val arrayListExercise: ArrayList<Double> = ArrayList<Double>(5)
    var list: MutableList<Double> = mutableListOf<Double>()

    list.add(10.00)
    list.add(20.00)
    list.add(30.00)
    list.add(40.00)
    list.add(50.00)

    arrayListExercise.addAll(list)

    var average = 0.00
    for (element in arrayListExercise){
         average += element
    }
    average /= arrayListExercise.size
    println(average)

}
