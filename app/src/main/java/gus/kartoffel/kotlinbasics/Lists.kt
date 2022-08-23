package gus.kartoffel.kotlinbasics

fun main(){
    val months = listOf("Jan", "Feb", "Mar")
    val anyTypes = listOf(1,2,3,true,false,"String")
    println(anyTypes.size)
    println(months[1])
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("Apr", "May", "Jun")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("Jul")

    for(months in additionalMonths){
        println(months)
    }

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    days.removeAt(3)
    val removeList= mutableListOf<String>("Mon", "Wed")
    days.removeAll(removeList)
    print(days)
}