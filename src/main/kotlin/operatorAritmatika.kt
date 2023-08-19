fun main() {
    val angka1 = 10
    val angka2 = 5
    val angka00 = 1_000_000 //readable

    var hasil = angka1 + angka2
    println(hasil)

    hasil = angka1 - angka2
    println("Hasil dari $angka1 - $angka2 = $hasil")

    val a = 9
    var b = 3
    println("Hasil dari a * b = ${a * b}")

    b = 2
    println("Hasil dari a / b = ${a / b}")

    var x = 10
    println(x)

    x += 10 // sama dengan x = x + 10
    println(x)

    println(angka00)
}