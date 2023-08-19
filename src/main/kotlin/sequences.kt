package com.ophi

fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 } //dimulai dari 1
    sequenceNumber.take(10).forEach { println("$it ") } //fungsi take untuk mencegah infinite loop
}