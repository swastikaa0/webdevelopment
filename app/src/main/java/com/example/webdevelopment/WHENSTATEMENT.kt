package com.example.webdevelopment

fun main() {
    print("Please enter a day number of the week (1-7): ")
    val dayNumber: Int = readln().toInt()
    val day: String = when(dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }

    println(day)
}
