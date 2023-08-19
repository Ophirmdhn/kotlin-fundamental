fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    //key harus unik (tidak boleh sama)

    println(capital["Jakarta"]) //memanggil data dalam map
    println(capital.getValue("London"))

    val mapKeys = capital.keys //untuk menampilkan key yang ada di dalam map
    println(mapKeys)

    val mapValues = capital.values //untuk menampilkan value yang ada di dalam map
    println(mapValues)
}