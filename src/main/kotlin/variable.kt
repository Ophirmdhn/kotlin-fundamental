//Variable Constant = variable global yang bisa di akses dimanapun
const val TITLE = "Belajar Kotlin"
const val OS = "Android"

fun main() {
    var angka: Int = 10 //Membuat variabel default
    var angka2 = 5 //Tanpa menuliskan tipe data
    var angka3: Int //Tanpa inisial nilai
    val angka4 = 23 //Val nilainya tidak bisa di ganti
    val nama = "Ophi"
    var nilai = true

    println(angka)
    println("Nilai dari variable angka4 adalah : $angka4")
    // untuk menampilkan variable dalam string.

    println("Hai $nama angka anda adalah $angka")
    println("nilai asli = $nilai")

    nilai = false
    println("nilai setelah diubah = $nilai")

    println("$TITLE")
    println(OS)
}