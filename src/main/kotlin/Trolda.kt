package bot

import java.util.Scanner


val scanner = Scanner(System.`in`)

fun main() {
    greet("Trolda", "2021")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("What are the two measurement systems for counting units of information?")
    println("""
        1. Decimal-based system and matrix-based system.
        2. Decimal-based system and binary-based system.
        3. Binary-based system and skynet-based system.
        4. Binary-based system and kibi-based system.
    """.trimIndent()
    )
    var answer = scanner.nextInt()
    while (answer != 2) {
        println("Please, try again.")
        answer = scanner.nextInt()
    }
}

fun end() {
    println("Congratulations, have a nice day!")
}