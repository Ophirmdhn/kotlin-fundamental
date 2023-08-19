fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun sets(vararg number: Int): Int{
    return number.size
}

fun main() {
    val result = hitungTotal("Ophi",10,10,10,10,10)
    println(result)

    val number = intArrayOf(1,2,3,4,5)
    println(sets(*number,6,7,8,9,10)) //* untuk memasukan array kedalam fungsi
}