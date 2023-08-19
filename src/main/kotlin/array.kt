fun main() {

    val name = arrayOf("Dwi", "Ophi", "Ramadhan")
    println(name[1])

    val lastName: String = name.get(2) //bisa name[2]
    println(lastName)

    val angka = IntArray(5)
    println(angka.size)

    println()
    val nomor = arrayOf(3,5,7,2,0,12,56,23,8)
    var max = nomor[0]
    for (i in nomor){
        if (i > max) {
            max = i
        }
    }
    for (i in nomor) {
        println(i)
    }
    println("Nilai Tertinggi = $max")

    //Array yang boleh null
    val alamat: Array<String?> = arrayOfNulls(3)
    alamat.set(0, "Wanggu") //bisa menggunakan set bisa tidak
    alamat[1] = null
    alamat[2] = "Luar Wanggu"

    for (data in alamat) println(data)
    println(alamat.size)
}
