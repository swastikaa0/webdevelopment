package com.example.webdevelopment

fun main() {
    var number: Int

    do {
        print("Enter a number (0 to exit): ")
        number = readln().toInt()
        println("You entered: $number")
    } while (number != 0)

    println("Loop ended because you entered 0.")
}
