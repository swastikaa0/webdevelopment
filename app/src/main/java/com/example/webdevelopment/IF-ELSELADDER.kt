package com.example.webdevelopment

fun main() {
    print("Please enter your age: ")
    val yourAge = readln().toInt()

    if (yourAge < 13) {
        println("You are a child")
    } else if (yourAge < 19) {
        println("You are a teenager")
    } else {
        if (yourAge < 50) {
            println("You are an adult")
        } else {
            println("You are a senior")
        }
    }
}
