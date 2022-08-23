package gus.kartoffel.kotlinbasics

import java.lang.IllegalArgumentException

fun main(){
    /*
    // immutable variable
    // TODO: Add new functionality
    /* This
       Is
       a
       Comment
    */

    // String
    val myName = "Karto "
    // Int
    // Type inference in Kotlin
    var myAge = 31
    println("Hello $myName")

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    println("First character $firstCharInStr ")
    println("Last character $lastCharInStr")

    // Arithmetic operators % remainder in division
    var result = 5+5
    result *= 2
    println(result)

    // comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==5
    println("isEqual is $isEqual")

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")


    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    var age = 15

    if (age >= 21){
        println("You can do whatever uwu")
    }else if(age >= 18){
        println("You can vote but not much more")
    }else if(age >= 16){
        println("You can maybe drive, still a kiddo tho")
    }else{
        println("GTFO you too young")
    }

    when(age){
        in 0..15 -> println("GTFO you too young")
        in 16..17 -> println("You can maybe drive, still a kiddo tho")
        in 18..20 -> println("You can vote but not much more")
        in 21..200 -> println("You can do whatever")
        else -> println("Invalid age")
    }

    var whileDesc = 100
    while(whileDesc >0){
        if (whileDesc % 2 == 0){
            println("$whileDesc")
        }
        whileDesc --
    }
    println("While loop over")

    var powerLevel = 0
    for(powerLevel in 0..10000){
        if(powerLevel == 9001){
            println("IT'S OVER 9000!!!!!!")
        }else if(powerLevel == 10000){
            println("$powerLevel")
        }
    }

    var humidityLevel = 80
    var humidity = "humid"
    while(humidity == "humid"){
        humidityLevel -=5
        println("humidity decreased")
        if(humidityLevel <=60){
            humidity = "comfy"
            println("it's $humidity now")
        }else{
            println("it's $humidity now")
        }
    }


    var average = avg(25.00, 50.00)
    print("Result is $average")

    // NULLABLES/OPTIONALS in Kotlin
// Kotlin supports nullability as part of its type System.
// That means You have the ability to declare whether
// a variable can hold a null value or not.
// By supporting nullability in the type system,
// the compiler can detect
// possible NullPointerException errors at compile time
// and reduce the possibility of having them thrown at runtime.
    var name: String = "Denis"
// name = null // Compilation Error

    var nullableName: String? = "Denis"
    nullableName = null // Works

// Here name cannot/must not be null
    val len = name.length
    val upper = name.lowercase()

// but the same methods won't work on nullable types
   // val len2 = nullableName.length // Compilation Error
   // val upper2 = nullableName.lowercase()  // Compilation Error

// So how can we solve this? We could do a null check before hand

    val nullableName2: String? = "Denis"

    if(nullableName2 != null) {
        println("Hello, ${nullableName2.lowercase()}.")
        println("Your name is ${nullableName2.length} characters long.")
    } else {
        println("Hello, Guest")
    }

// This works but seems to be quite some work...
// So how about we shorten the syntax...
// Kotlin provides a Safe call operator, ?.
// It allows you to combine a null-check and
// a method call in a single expression.

    nullableName2?.lowercase()

// This is the same as:
    if(nullableName2 != null)
        nullableName2.lowercase()
    else
        null

// You can use methods on a nullable variable like this
    val nullableName3: String? = null

    // println(nullableName3?.lowercasee()) // prints null
    // println(nullableName3?.length) // prints null

// You can perform a chain safe calls:
    //val wifesAge: String? = user?.wife?.age


// Let'S say we don’t want to print anything if
// the variable is null?

// In order to perform an operation only if the
// variable is not null, we can use the safe call
// operator with let -

    val nullableName4: String? = null

    nullableName4?.let { println(it.lowercase()) }
    nullableName4?.let { println(it.length) }
// Prints nothing because there nullableName is null
// and we used let to prevent anything from being performed


// What if we would like to enter a default value?
// Then we can use the elvis operator ?:
    val name2 = nullableName4 ?: "Guest"

    //val wifesAge2: String? = user?.wife?.age ?: 0


// Not null assertion : !! Operator
// The !! operator converts a nullable type to a
// non-null type, and throws a NullPointerException
// if the nullable type holds a null value.
// This is risky, and you should only use it if
// you are 100% certain, that there will be a value in
// the variable.
    val nullableName5: String? = null
    nullableName5!!.lowercase() // Results in NullPointerException



    var gustavo = Person("Gustavo", "Teran", 25)
    gustavo.hobby = "vidyageims"
    println("${gustavo.firstName} is ${gustavo.age} years old")
    gustavo.stateHobby()
    var john = Person()
    var xiao = MobilePhone("Android", "Xiaomi", "Redmi note 11 Pro")
    println(xiao.chargeBattery(30))
    var samsung = MobilePhone("Android", "Samsung", "Galaxy s21 fe")
    var iphone = MobilePhone("IOS", "Apple", "Iphone 13 Pro Max")

    var myCar = Car()
    println("Brand is: ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Max speed of ${myCar.myBrand} is ${myCar.maxSpeed}")

    val user1 = User(1,"Denis")
    val name = user1.name
    println(name)
    user1.name = "Michael"
    val user2 = User(1, "Michael")
    println(user1 == user2)
    println("User details: $user1")

    val updatedUser = user1.copy(name = "Denis Panjuta")
    println(updatedUser)
    println(user1)
    println(updatedUser.component1()) //prints 1
    println(updatedUser.component2()) //prints Denis Panjuta

    val (id,name2) = updatedUser
    println("id= $id, name= $name2")

     */

    var myCar = Car2("A3", "Audi",200.00)
    var MyEcar = ElectricCar("S-Model", "Tesla", 85.0, 240.00)
    MyEcar.extendRange(200.0)
    //Polymorphism: treat objects similarly with common traits
    myCar.drive(200.00)
    MyEcar.drive(200.00)
    println(MyEcar.drive())
    MyEcar.brake()
    myCar.brake()

}

// average of 2 values function
fun avg(a: Double, b: Double) : Double {
     return (a+b)/2

}

class Person (firstName: String = "John", lastName: String = "Doe"){
    //member variables
    var age : Int? = null
    var hobby: String = "Watch Netflix"
    var firstName : String? = null

    // initializer block
    init {
        this.firstName = firstName // this call variable regular calls parameter
        println("person created. firstName = $firstName and lastName = $lastName")
    }

    //Member secondary constructor

    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
                this.age = age
                println("person created. firstName = $firstName and lastName = $lastName and $age")
            }

    //Member function - Method
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

class MobilePhone (osName: String, brand: String, model: String){
    private var battery = 30
    var brandInternal = brand
    init {
        println("New phone added. $brand $model using $osName")
    }
    fun chargeBattery(chargedBy: Int){
        println("$brandInternal had $battery% battery. it is at ${battery+chargedBy}% battery now")
        battery += chargedBy
    }

}

// scope example. You can create variable within the scope not to be called outside the scope. Vars in the same file are available for all scopes
fun myFunction(a: Int){
    var a = 5
}

class Car(){
    lateinit var owner: String
    val myBrand: String = "BMW"
        // custom getter
        get(){
        return field.lowercase()
        }

    var maxSpeed: Int = 250
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Maxspeed can't be less than 0")
        }
    var myModel : String = "M5"
        private set
    init{
        this.owner = "Frank"
    }
}

data class User(val id: Long, var name: String)

//super class, parent class, base class of electriccar
open class Car2(val name: String, val brand: String, override val maxSpeed: Double): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0)
            range += amount
    }

    override fun drive(): String {
        return "driving the interface drive"
    }
    open fun drive(distance:Double){
        println("Drove for $distance KM")
    }
}

// sub class of car2 (child or derived class)
class ElectricCar(name: String, brand: String, batteryLife: Double, maxSpeed: Double) : Car2(name, brand, maxSpeed){
    override var range = batteryLife * 6
    override fun drive(distance:Double){
        println("Drove $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for $range KM on electricity"
    }

    override fun brake() {
        super.brake()
        println("brake inside Ecar")
    }
}

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is brakings")
    }
}


