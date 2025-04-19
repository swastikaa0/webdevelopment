package com.example.webdevelopment

fun main() {
    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z") // Output: z = x + y = 30

    z += x // Equivalent to z = z + x
    println("z += x = $z")   // Output: z += x = 50

    z -= x // Equivalent to z = z - x
    println("z -= x = $z")   // Output: z -= x = 30

    z *= x // Equivalent to z = z * x
    println("z *= x = $z")   // Output: z *= x = 600

    z /= x // Equivalent to z = z / x
    println("z /= x = $z")   // Output: z /= x = 30

    z %= x // Equivalent to z = z % x
    println("z %= x = $z")   // Output: z %= x = 10
}