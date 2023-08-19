fun helloWorld() {
    println("Hellau Gaess")
}

//fungsi dengan parameter
fun sayHello(firstName: String, lastName: String) {
    println("Selamat Datang, $firstName $lastName")
}

//default parameter
fun hello(firstName: String, lastName: String = "") { //parameter lastName bisa tidak diisi
    println("Hello $firstName $lastName")
}

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hai $firstName $middleName $lastName")
}

//function return type
fun tambah(a: Int, b: Int): Int{ //returnnya bertipe data Int
    val total = a + b
    return total
    //atau bisa langsung
    //return a + b
}

//single expression function
fun hi(name: String) = println("Hi $name!")

/*
fun setUser(name: String, age: Int): String {
    return "Hai $name pasti umurmu $age to"
}
*/

//bisa disingkat menjadi
fun setUser(name: String, age: Int): String = "Hai $name pasti umurmu $age to"

fun main() {
    helloWorld() //memanggil function
    sayHello("Ophi", "Ramadhan")
    hello("Ophai")

    //function named argument
    //memungkinkan memanggil nama parameter tanpa sesuai urutan
    fullName(
        firstName = "Dwi",
        lastName = "Ramadhan",
        middleName = "Ophi"
    )

    val hasil = tambah(10, 5)
    println(hasil)

    hi("Ophaiii")

    println(setUser("Ophi", 19))
}