data class Student(val name: String, val age: Int)

fun main() {
    val student = Student("Ophi", 19)

    student.let {
        println(it.name)
        println(it.age)
    }

    val result = student.run {
        "Name ${this.name}, age ${this.age}"
    }
    println(result)

    val result2 = student.apply {//returnya objek itu sendiri (student)
        "Name ${this.name}, age ${this.age}"
    }
    println(result2)

    val result3 = student.also {
        "Name ${it.name}, age ${it.age}"
    }
    println(result3)

    val result4 = with(student) {
        "Name ${this.name}, age ${this.age}"
    }
    println(result4)
}