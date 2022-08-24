package gus.kartoffel.kotlinbasics

import java.lang.ArithmeticException

fun main(){
    /*
    An exception is a runtime problem which occurs in the program and lead to program termination https://kotlinlang.org/docs/exceptions.html
    some problems can be: running out of memory, array out of bound, conditions like divided by zero

    to handle this exception handling is used. This handles the runtime problems and maintains the flow of the program execution

    throw MyException("This throws an Exception")
    there are 4 different keyword in exception handling: try, catch, finally and throw

    try: contains a set of statements which might generate and exception. It must be followed by catch or finally  or both
    catch: is used to catch the exception from the try block
    finally: always executes whether the exception is handled or not. it is used to execute important code statements (ex: closing buffers)
    throw: throws an exception explicitly

    try-catch block is used for exception handling in the code. Syntax:

    try{
        code that may throw exception
    }catch(e: SomeException){
        code that handles the exception
    }

    Nested try blocks are used when a block of code generates an exception and within that block another code statement also generates an exception

    syntax:
    try{
        code block
            try{
                code block
            }catch(e:SomeException){
                exceptionHandling
            }
    }catch(e:SomeException){
        exceptionHandling
    }

    finally block is always executed whether the exception is handled or not. for important code
     */

    //no exception handling

    val str = getNumber("50")
    println(str)

}

fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    }catch(e:ArithmeticException){
        0
    }catch (e:NumberFormatException){
        0
    }finally{
        println("Finally block always executes")
    }
}