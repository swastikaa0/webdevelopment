package com.example.webdevelopment

fun main() {
    var sum: Int = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x
        }
    }
    println("The sum of even numbers is $sum")
}
