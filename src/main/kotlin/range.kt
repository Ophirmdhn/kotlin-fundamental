fun main() {
    //sama seperti array
    val range = 0..10
    val range1 = 100 downTo 50 step 2
    val range2 = 0..100 step 5

    for (i in range2) println(i)

    range.forEach {
        println("value is $it")
    }

    range1.forEach {nilai ->
        println("nilai ke $nilai")
    }

    range.forEachIndexed { index, value -> //Jika hanya ingin menggunakan index, ubah argumen value menjadi __
        println("value $value with index $index")
    }

    val rangeChar = 'A'..'Z' //bisa menggunakan 'A'.rangeTo('Z')
    for (char in rangeChar) println(char)

    val ranges = 1.rangeTo(10) step 2
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}