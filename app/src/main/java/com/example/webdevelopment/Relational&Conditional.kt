package com.example.webdevelopment

fun main() {
    val age = 25
    val isStudent = true
    val grade = 'A'
    val score = 85

    println("--- Relational Operators ---")
    println("age > 18: ${age > 18}")       // Output: age > 18: true
    println("age < 30: ${age < 30}")       // Output: age < 30: true
    println("age >= 25: ${age >= 25}")     // Output: age >= 25: true
    println("age <= 20: ${age <= 20}")     // Output: age <= 20: false
    println("age == 25: ${age == 25}")     // Output: age == 25: true
    println("age != 30: ${age != 30}")     // Output: age != 30: true

    println("\n--- Conditional Operators ---")

    // if-else statement
    if (age >= 18) {
        println("You are an adult.") // Output: You are an adult.
    } else {
        println("You are a minor.")
    }

    // if-else if-else statement
    if (score >= 90) {
        println("Grade: A+")
    } else if (score >= 80) {
        println("Grade: A")   // Output: Grade: A
    } else if (score >= 70) {
        println("Grade: B")
    } else {
        println("Grade: Below B")
    }

    // Nested if statement
    if (isStudent) {
        println("You are currently a student.") // Output: You are currently a student.
        if (grade == 'A') {
            println("You have an excellent grade.") // Output: You have an excellent grade.
        } else {
            println("Your grade is not A.")
        }
    } else {
        println("You are not a student.")
    }

    // Using logical AND (&&)
    if (age > 20 && isStudent) {
        println("You are an adult student.") // Output: You are an adult student.
    }

    // Using logical OR (||)
    val hasScholarship = false
    if (score >= 80 || hasScholarship) {
        println("You qualify for something!") // Output: You qualify for something!
    }

    // Using logical NOT (!)
    if (!hasScholarship) {
        println("You do not have a scholarship.") // Output: You do not have a scholarship.
    }

    // when expression (like switch in other languages)
    when (grade) {
        'A' -> println("Excellent!")      // Output: Excellent!
        'B' -> println("Good!")
        'C' -> println("Okay.")
        else -> println("Needs improvement.")
    }

    // when expression with multiple conditions
    when (score) {
        in 90..100 -> println("Very High Score")
        in 80 until 90 -> println("High Score") // 80 inclusive, 90 exclusive
        75, 76, 77 -> println("Close to High Score")
        else -> println("Average or Below")
    }
}