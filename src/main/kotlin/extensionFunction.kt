//extension function
fun Int.printInt() {
    println("value $this") //this adalah receiver type yang bertindak sebagai objeknya
}

fun Int.plusThree(): Int {
    return this + 3
}

//extension properties
val Int.slice: Int
    get() = this / 2

fun main() {
    23.printInt() //memanggil fungsi
    println(10.plusThree())

    println(10.slice) //memanggil extension properties
}