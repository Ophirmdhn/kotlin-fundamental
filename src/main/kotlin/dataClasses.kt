class User(val name: String, val age: Int) { //class biasa
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
    //class memerlukan fungsi toString untuk melihat value dari properti yang ada
}


data class DataUser(val name: String, val age: Int) //data class

fun main() {
    val user = User("Ophi", 19)

    val dataUser = DataUser("Ophi", 19)
    val dataUser2 = DataUser("Ophi", 19)
    val dataUser3 = dataUser.copy() //mengcopy data user
    val dataUser4 = dataUser.copy(name = "Dwi")

    println(user)
    println(dataUser)

    println(dataUser.equals(dataUser2)) //data class memiliki fungsi equals secara otomatis

    println(dataUser3)
    println(dataUser4)
}
