package gus.kartoffel.kotlinbasics

fun main(){
    /*
    sometimes it is not possible to cast a variable and it throws an exception
    this is called unsafe cast

    unsafe cast is performed by infix operator as

    trying to cast an Int of the any type into a string type leads to a ClassCastException

    as? provides a safe cast operation to safely cast a type
     */
    // example a nullable string (String?) can;t be cast to a non nullable string (String). This throws an exception

    val obj: Any? = null
    val str: String = obj as String
    println(str)
}