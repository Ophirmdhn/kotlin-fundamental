import java.util.*

fun main() {
    /*
    Fold
    Melalukan perhitungan setiap nilai pada collection tanpa melakukan iterasi item 1/1
     */
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold\n")

    //foldRight() melakukan proses iterasi dari indeks terakhir
    val numbers2 = listOf(1,2,3)
    val foldRight = numbers2.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $foldRight\n")

    //Drop = Memangkas item
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3) //memangkas 3 item pertama
    println(drop)

    val dropLast = number.dropLast(3) //menghapus 3 item terakhir
    println(dropLast)

    //Take = Menyaring item
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(2)
    println(take)

    val takeLast = total.takeLast(2)
    println(takeLast)

    //Slice = Menyaring item dari posisi tertentu
    val numbers3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = numbers3.slice(3..6)
    println(slice)

    val index = listOf(0,9)
    val slice2 = numbers3.slice(index) //menyaring dengan lebih spesifik
    println(slice2)

    //Distinct = menyaring item yang sama
    val numbers4 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = numbers4.distinct()
    println(distinct)

    //Chunked = memecah nilai string menjadi beberapa bagian dalam bentuk array
    val word = "QWERTY"
    val chunked = word.chunked(2)
    println(chunked)

    val chunkedTransform = word.chunked(2) {
        it.toString().lowercase(Locale.getDefault()) //mengubah menjadi lowercase
    }
    println(chunkedTransform)
}