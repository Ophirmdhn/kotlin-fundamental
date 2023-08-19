data class DataAdmin(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main() {
    val dataAdmin = DataAdmin("Ophai",19)
    dataAdmin.intro() //memanggil fungsi

//    val name = dataAdmin.component1() //mengambil pro perti secara berurut
//    val age = dataAdmin.component2()

    //bisa juga dengan cara seperti ini
    val (name, age) = dataAdmin
    println("$name $age years old")

}