fun main() {
    val angka = mutableListOf<Int>()

    var rataRata = 0.0
    println("Masukan 5 Angka : ")
    for (i in 1..5){
        val input = readln().toInt()
        angka.add(input)
        rataRata += input / 5.0
    }
    println(angka)
    println("Nilai rata - ratanya adalah $rataRata")
}