fun setWord(message: String) {
    fun printMessage() {
        println(message) //bisa mengakses parameter dari fungsi terluarnya
    }
    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

fun main() {
    setWord("Ophi")
    println(sum(5,10,15))
}