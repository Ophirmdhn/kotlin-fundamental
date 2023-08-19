fun main() {
    val text: String? = null

    if (text != null) println(text.length)

    //Safe Calls ?.
    text?.length //akan dilewati ketika objek bernilai null

    //Elvis Operator ?:
    val textLenght = text?.length ?: 10

    /*
    kode ditasa sama dengan
    val textLenght = if (text != null) text.length else 10
    */

    println(textLenght)
}