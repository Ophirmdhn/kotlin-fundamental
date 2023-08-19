fun main() {
    val angka = listOf(1,3,5,7,9)
    //berbeda dengan array, list datanya tidak dapat diubah (imutable)

    val nomor = mutableListOf(1,2,3,4) //list yang bisa diubah nilainya (mutable)

    nomor.add(5) //menambahkan data kedalam list
    println(nomor)

    nomor.remove(3) //menghapus data yang bernilai 3
    println(nomor)

    nomor.removeAt(0) //menghapus data berdasarkan index
    println(nomor)

    val list = mutableListOf<Int>() //membuat mutable list kosong
    for (i in 1..5) {
        print("Masukan Angka : ")
        val input = readLine()?.toInt()
        if (input != null) {
            list.add(input)
        }
    }
    for (i in list){
        println(i)
    }
    println(list)
}