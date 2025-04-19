package com.example.webdevelopment

fun main() {
    val dictionary = mapOf(
        "apple" to "A round fruit with firm, white flesh and a green, red, or yellow skin.",
        "banana" to "A long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe.",
        "computer" to "An electronic device for storing and processing data, typically in binary form, according to instructions given to it in a variable program.",
        "book" to "A written or printed work consisting of pages glued or sewn together along one side and bound in covers.",
        "sun" to "The star around which the earth orbits, and which provides light and heat to the earth."
    )

    println("Welcome to the Simple Dictionary App!")

    while (true) {
        print("Enter a word (or type 'exit' to quit): ")
        val input = readln().lowercase()

        if (input == "exit") {
            println("Goodbye!")
            break
        }

        val meaning = dictionary[input]

        if (meaning != null) {
            println("Meaning: $meaning\n")
        } else {
            println("Sorry, the word '$input' is not found in the dictionary.\n")
        }
    }
}