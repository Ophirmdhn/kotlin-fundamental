fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    //AND
    val isOpen = now >= officeOpen && now <= officeClosed

    println("Office is Open : $isOpen")
}