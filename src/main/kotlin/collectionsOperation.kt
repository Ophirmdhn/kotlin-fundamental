fun main() {
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)

    val evenList = numberList.filter { it % 2 == 0 } //fungsi filter (mengambil data yang habis dibagi 2)
    println(evenList)

    val notEvenList = numberList.filterNot { it % 2 == 0 } //fungsi non filter
    println(notEvenList)

    val newMap = numberList.map { it * 2 } //membuat map berdasarkan data pada list yang dikali 2
    println(newMap)

    println(numberList.count()) //menghitung jumlah yang ada dalam collection
    println(numberList.count { it % 3 == 0 })

    val firstOddNumber = numberList.find { it % 2 == 1 } //mencari yang ada dalam colection
    println(firstOddNumber)

    println(numberList.first()) //mengambil item pertama
    println(numberList.last()) //mengambil item terakhir

    val total = numberList.sum() //menjumlahkan semua item pada collection yang bertipe angka
    println(total)

    val dataChar = listOf('C','X','A','P','G')
    val ascendingSort = dataChar.sorted() //mengurutkan data secara ascending
    println(ascendingSort)

    val descendingSort = dataChar.sortedDescending() //kebalikan dari ascending
    println(descendingSort)
}