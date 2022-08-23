package gus.kartoffel.kotlinbasics

fun main(){
    /*
    A lambda expression is a function with no name

    they and anonymous functions are function literals. They are functions that are not declared but are passed immediately as an expression

    they are defined with curly braces {} which takes variables as a parameter (If any) and body of a function

    syntax {variable(s) -> body_of_lambda}
     */

    //returning Int. Can't do same as println since the value needs to follow the structure of what needs to be returned
    val sum: (Int, Int) -> Int =  { a: Int, b:Int -> a+b}
    println(sum(10,5))

    //shorter ver not returning

    val sumShort = { a: Int, b:Int -> println(a+b)}
    sumShort(10,5)

}