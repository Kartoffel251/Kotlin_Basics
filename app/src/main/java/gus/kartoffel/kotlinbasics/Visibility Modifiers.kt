package gus.kartoffel.kotlinbasics

fun main(){
    /*
        Visibility are keywords which are used to restrict the use of classes, interfaces, methods, properties in Kotlin

        they are used at multiple places such as class headers or method bodies

        categorized into fou different types: public, private, protected, internal

        public is default modifier. Can be accessed from everywhere in the project.

        private allows the element to be accessible only within the block iun which properties, fields, etc. are declared

        private does not allow access outside the scope

        a private package can be accessible within that specific file

        The internal modifier is a Kotlin feature which is not in Java. It makes the field visible only inside the module in which it is implemented

        All fields are declared as internal which are accessible only inside the module in which they are implemented.

        Open keyword. In kotlin all classes are final by default, so they can't be inherited by default. In Java it's the opposite.

        to make a class inheritable you have to use Open keyword.

        Protected modifier with a class or an interface allows visibility to its class or subclass only.

        a protected declaration when overridden in its subclass is also protected unless it is explicitly changed.

        can't be declared at top level (for packages)
     */



}

// public example. All below accessible from anywhere in the project

public class ExamplePu{

}

class Demo{

}

public fun hello(){

}

fun demo(){

}

public val x= 5

val y = 10

// private example. ExamplePri only accessible from this file. Val and fun only accessible within ExamplePri class

private class ExamplePri {
    private val x = 1

    private fun doSomething(){

    }
}

// Internal example. Visible within the module only. Module = files compiled at the same time being interdependent

internal class ExampleInternal {
    internal val x = 5

    internal fun getValue(){

    }
}

internal val t = 10