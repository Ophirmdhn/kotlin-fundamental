typealias Arithmetic = (Int, Int) -> Int

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    println(sum(10,10))
}



