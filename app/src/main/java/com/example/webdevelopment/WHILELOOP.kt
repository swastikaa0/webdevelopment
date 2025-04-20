package com.example.webdevelopment

fun main() {
    var num = 1
    var sum = 0

    while (num <= 10) {
        sum += num
        num++
    }

    println("The sum of numbers from 1 to 10 is $sum")
}
