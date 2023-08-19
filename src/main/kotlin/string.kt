import java.util.*

fun main() {

    val firstName = "Ophi"
    val lastName = "Ramadhan"
    val fullName = "$firstName $lastName"

    println(fullName)
    println("Nama Anda : ${fullName.uppercase(Locale.getDefault())}")
    println("${fullName.length}")

    val address = """
        |Wanggu
        |Alam Indah
    """.trimMargin()

    val tes = """
        >Ummmm
        >Tess doang
    """.trimMargin(">")


    println(address)
    println(tes)

    val hour = 6
    println("office ${if (hour > 7) "already close" else "is Open"}")
}