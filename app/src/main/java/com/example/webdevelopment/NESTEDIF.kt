package com.example.webdevelopment

fun main() {
    println("Please enter 3 numbers:")

    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()
    val number3: Int = readln().toInt()

    val largestNumber: Int

    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }

    println("The largest number is $largestNumber")
}
