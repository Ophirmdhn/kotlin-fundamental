var sum: (Int) -> Int = { value -> value + value }

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun main() {
    printResult(10,sum)
}