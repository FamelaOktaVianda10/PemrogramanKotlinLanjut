fun main(args: Array<String>) {
    //conditions
    if (15 > 5)
        println("True")
    println("The program continues here...")

    //If -  Else
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b){
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " + max)

    //If - Else if
    var myVar: Int = 0 // equivalent of 1 <= i && i <= 10
    if (myVar == 0) { // if the value is 0, we change its value to 1
        myVar = 1
    } else if(myVar ==  1){ // if the value is 1, we change its value to 0
        myVar = 0
    } else {
        myVar = -1
    }
    println("Nilai myVar adalah " + myVar)

    print("\nEnter a number : ")
    val intNumber = readLine()!!.toInt()
    if (intNumber > 5)
        println("The number you entered is greater than 5!")
    println("Thanks for the input!")
}