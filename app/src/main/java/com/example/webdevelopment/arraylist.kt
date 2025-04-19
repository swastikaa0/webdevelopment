package com.example.webdevelopment

fun main(args: Array<String>) {
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20)  // Insert 20 at index 1
    age1.add(5)

    println("Elements in age1:")
    for (age in age1) {
        println(age)
    }
    println()

    var age2 = arrayListOf<Int>(1, 20, 5)
    println("Initial size of age2: ${age2.size}")
    age2.clear()
    println("Size of age2 after clearing: ${age2.size}")
    println()

    var name = arrayListOf<String>("sandis", "ram", "shyam")
    name.add("hari")
    name.add(4, "Sita")

    name.remove("shyam")
    name.removeAt(0)

    println("Current names: $name")

    val searchName = "hari"
    if (name.contains(searchName)) {
        println("The name '$searchName' exists in the list.")
    } else {
        println("The name '$searchName' does not exist in the list.")
    }
    println()

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0)
    println("Size of mixArrayList: ${mixArrayList.size}")
    println("Element at index 0 of mixArrayList: ${mixArrayList[0]}")
    println("Element at index 1 of mixArrayList: ${mixArrayList[1]}")
    println("Element at index 2 of mixArrayList: ${mixArrayList[2]}")
}


