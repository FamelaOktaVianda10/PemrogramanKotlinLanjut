fun main(args: Array<String>) {
    //Nullabel types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}