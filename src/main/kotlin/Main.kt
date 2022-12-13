fun main(args: Array<String>) {

    val list = listOf("Kotlin", "is", "fun")
    //val count = list.count { currentString -> // lamda func
    val count = list.customCount  { currentString ->
        //currentString.length == 3
        currentString.length >= 3
    }

    println(count)

//    val number = readLine() ?: "0"
//    val parsedNumber = try {
//        number.toInt()
//    } catch (e: Exception) { //catch kotlin err if user input is not converteable to int
//        0
//    }
//println(parsedNumber)


//    val bear = object  : Animal(name = "Bear") {
//        override fun makeSound() {
//            println("Mõmm-mõmmm!")
//        }
//    }
//    val dog = Animal(name = "Dog")


//    val dog = Dog()
//    dog.bark()
//
//    val cat = Cat()
//    cat.mjäu()

//    var x: Int = 3
//    println("Value of x is $x")
//      x= 7
//    println("Value of x is now $x")
//
//    val y = 3
//    println("Value of y is now $y")

//    val wholeNumber = 3
//    val bigNumber = 3L
//    val preciseDecimal = 3.33
//    val decimal = 3.33f
//    val iLoveVegetables = false
//    val iLovePizza = true
//    val iAmALetter = 'a'
//    val z  = 3*4
//    val j = 3f/4f
//
//    println("$z ,$j")

//    val amIanAdult = true
//    val amIaProgrammer = true
//    val amIanAdultProgrammer = amIanAdult && amIaProgrammer
//    val amIanAdultProgrammer = amIanAdult || amIaProgrammer
//    val amIanAdultProgrammer = amIanAdult == amIaProgrammer
//    val amIanAdultProgrammer = amIanAdult != amIaProgrammer
//    val amIanAdultProgrammer = !(amIanAdult != amIaProgrammer)
//
//    println(amIanAdultProgrammer)

//    val string = "Portugal is the best"
//    println(string.toUpperCase())

//    val c = 1+3
//    if (c==2) {
//        println("c is 2")
//    } else if (c==3){
//        println("c is 3")
//    } else {
//        println("c is not 2 or 3")
//        //val b = if(a==2) 2 else 3
//    }
//

//    You can make a nullable with "?"
//val x: Int? = null

//    val number1 = readLine()
//    val number2 = readLine()
//    val result = number1!!.toInt() + number2!!.toInt() //!! says that it is Ok, we know that number is not 0 - not recommended
//    println(result)                           Better option is ?:"0"


//    val number1 = readLine() ?:"0"
//    val number2 = readLine() ?:"0"
//    val result = number1.toInt() + number2.toInt() //!! says that it is Ok, we know that number is not 0
//    println(result)

//val shoppingList = listOf<String>("BMW", "Villa", "Rolex") // Immutable list
//   // println(shoppingList[2])
//
//    val shoppingList2 = mutableListOf("BMW", "Villa", "Rolex") // Immutable list
//    shoppingList2.add("Ferrari")
    //println(shoppingList2[3])
//WHILE LOOP
//    var counter = 0
//    while (counter < shoppingList2.size) {
//        println(shoppingList2[counter])
//        counter++
//    }
// FOR LOOP
//    for (shoppingItem in shoppingList2) {
//        println(shoppingItem)
//    }
//    for (i in 1..10) {
//        println(i)
//    }

//    val x = 8
//    when(x) {
//        in 1..3 -> println("x is between 1 and 3")
//        in 4..6 -> println("x between 4 and 6 ")
//        else -> {
//            println("x out of range")
//
//        }
//    }


//print10Numbers()
// val x = isEven(5)
//    val x = isEven()
//    println(x)
//    val y = 3
//    println(y.isOdd())
//
//
    // Try adding program arguments via Run/Debug configuration.
   // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   println("Program arguments: ${args.joinToString()}")
}

//fun List<String>.customCount(function: (String) -> Boolean): Int {
fun <T>List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for (string in this ) {
        if(function(string)) {
            counter++
        }
    }
    return counter
}


//fun print10Numbers() {
//    for(i in 1..10)
//        println(i)
//}

//fun isEven (number: Int): Boolean {
//    return number % 2 == 0
//}

// default parameter Int=10
fun isEven (number: Int = 10): Boolean {
    return number % 2 == 0
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}