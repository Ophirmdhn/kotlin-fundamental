fun main() {
    val nilai = 'B'
    when (nilai) {
        'A' -> println("Sangat Baiq")
        'B' -> println("Bagusmeh")
        'C' -> println("Hampir Bagus")
        'D' -> println("Apaha ini")
        'E' -> println("Eiiii")
        else -> println("Janganmi Kuliah")
    }

    val ujian = 85
    when (ujian) {
        80, 85, 90, 100 -> println("Lulus!")
        else -> {
            println("Cemas kau dek!")
        }
    }

    val nilaiAkhir = 'A'
    val lulus = arrayOf('A', 'B', 'C')
    when (nilaiAkhir) {
        in lulus -> println("Alhamdulillah")
        !in lulus -> println("Hadehhh")
    }

    //Pengganti if else
    val final = 90
    when {
        final >= 85 -> println("Lulus!")
        final >= 70 -> println("Lumayan")
        else -> println("Gagal")
    }

    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)
}