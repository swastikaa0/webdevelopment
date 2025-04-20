package com.example.webdevelopment

fun main() {
    print("Please enter a number: ")
    val number = readln().toInt()

    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}