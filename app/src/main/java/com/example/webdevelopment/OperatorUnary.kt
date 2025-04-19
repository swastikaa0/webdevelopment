package com.example.webdevelopment

fun main() {
    var number: Double = 7.6
    var isCheck: Boolean = true

    println("+number = ${+number}")   // Output: +number = 7.6
    println("-number = ${-number}")   // Output: -number = -7.6
    println("++number = ${++number}") // Output: ++number = 8.6
    println("--number = ${--number}") // Output: --number = 7.6
    println("!isCheck = ${!isCheck}") // Output: !isCheck = false

    println("-----------------------------")

    var result: Double = 4.7
    println("result : $result")       // Output: result : 4.7

    println("result++ : ${result++}") // Output: result++ : 4.7 (value before increment)
    println("result : $result")       // Output: result : 5.7 (value after increment)

    result = 4.7 // Reset result for the next demonstration
    println("++result : ${++result}") // Output: ++result : 5.7 (value after increment)
    println("result : $result")       // Output: result : 5.7

    println("--result : ${--result}") // Output: --result : 4.7 (value after decrement)
    println("result : $result")       // Output: result : 4.7

    result = 4.7 // Reset result for the next demonstration
    println("result-- : ${result--}") // Output: result-- : 4.7 (value before decrement)
    println("result : $result")       // Output: result : 3.7 (value after decrement)
}