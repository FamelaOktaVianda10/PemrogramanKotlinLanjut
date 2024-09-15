fun main(args: Array<String>) {
    //Continue & Break label
    println("Example of Break and Continue Label")
    myLabel@ for (x in 1..10) { // appling the custom Label
        if (x == 5) {
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel // Specifing the Label
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}