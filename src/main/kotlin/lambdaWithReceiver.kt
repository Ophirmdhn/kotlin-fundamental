fun main() {
    val message = buildString {
        append("Dwi ")
        append("Ophi ")
        append("Ramadhan ")
    }
    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}
