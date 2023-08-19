fun main() {
    println("\n===Anuji ini program masukin Umur===")

    print("Coba kasi masuk umurmu : ")
    val inputUmur= readln().toInt()

    if (inputUmur <= 10) {
        println("Cil cil belum cukup umur kasian")
    } else if (inputUmur in 11..19){
        println("Yahh bisalah")
    } else if (inputUmur >= 20){
        println("Tuami deela OM")
    } else {
        println("Ndatau kau itu umurmu berapa")
    }

    /*
    (inputUmur in 11..19)
    sama dengan
    (inputUmur > 10 && inputUmur <= 19)
    */

}


