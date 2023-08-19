val message = { println("Haii Lambda") } //membuat lambda

val printMessage = { message: String -> println(message) } //lambda dengan parameter

val messageLength = { message: String -> message.length} //lambda dengan return

fun main() {
    message() //memanggil lamda
    printMessage("Hellau gaess")

    val length = messageLength("Hellau from Lamda")
    println("length = $length")
}