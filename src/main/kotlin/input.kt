import java.util.*

fun main() {

    // input string
    print("Masukan nama anda : ")
    val input = readLine()
    println("Nama anda adalah : $input")
    println("Nama anda adalah : ${input?.uppercase(Locale.getDefault())}")

    print("Masukan angka yang akan dikurangi 5 : ")
    val inputKurang = readLine()
    if (inputKurang != null) {
        println(inputKurang.toInt() - 5)
    }

    // input tipe data selain string
    val inputAngka = Scanner(System.`in`)

    print("Masukan angka : ")
    val angka = inputAngka.nextInt()
    println("angka anda = $angka")
    // returnnya INT

    print("Masukan angka : ")
    val angkaDecimal = inputAngka.nextDouble()
    println("Angka desimal anda adalah = $angkaDecimal")
    // returnnya Double


}