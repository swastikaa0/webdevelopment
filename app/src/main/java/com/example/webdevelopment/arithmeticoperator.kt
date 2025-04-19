package com.example.webdevelopment

fun main() {
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result") // Output: num1 + num2 is 15.6

    result = num1 - num2
    println("num1 - num2 is $result") // Output: num1 - num2 is 5.6

    result = num1 * num2
    println("num1 * num2 is $result") // Output: num1 * num2 is 53.0

    result = num1 / num2
    println("num1 / num2 is $result") // Output: num1 / num2 is 2.12

    result = num1 % num2
    println("num1 % num2 is $result") // Output: num1 % num2 is 0.6
}