fun main() {

    print("Masukan angka : ")
    var input = readln().toInt()
    println("Hitung mundur dimulai dari $input")

    while (input >= 0) {
        println(input)
        input--
    }

    print("Masukan angka pertama : ")
    val angka1 = readln().toInt()
    print("Masukan angka kedua : ")
    val angka2 = readln().toInt()

    var hasil = 1
    var i = 0 //untuk memulai

    while (i < angka2) {
        hasil *= angka1 //hasil = hasil * angka1
        i++
    }
    println("Hasil dari $angka1 pangkat $angka2 = $hasil")
}