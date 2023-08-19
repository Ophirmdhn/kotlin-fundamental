fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber) //::bisa digunakan sebagai instances dari function type.

    println(evenNumbers)

    var message = "Kotlin"

    println(::message.name)
    println(::message.get())

//    ::message.set("Kotlin Academy")

    println(::message.get())
}

fun isEvenNumber(number: Int) = number % 2 == 0