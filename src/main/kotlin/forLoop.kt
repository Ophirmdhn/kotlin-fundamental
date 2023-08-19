fun main() {

    val nilai = arrayOf(2,4,7,3,12,9,45,23,1,11)
    var nilaiMax = nilai[0]

    for (nilaiSementara in nilai) {
        if (nilaiSementara > nilaiMax) {
            nilaiMax = nilaiSementara
        }
    }
    println("nilai tertinggi = $nilaiMax \n")


    val angka = arrayOf(1,2,3,4,5)
    //memprint array
    for (i in angka) {
        println(i)
    }

    println("")
    for (i in 1..10) {
        println(i)
    }

    println("")
    for (i in 10 downTo 1) {
        println(i)
    }

    println("")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    println("")
    for (i in 'a'..'z') {
        println(i)
    }
}