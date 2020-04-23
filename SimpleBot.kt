package bot

import javax.crypto.Mac
import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    val machine = Machine()
    println ("Hello! My name is ${machine.name}.")
    println("I was created in 2020.")
    println("Please, remind me your name.")
    val user = User (scanner.next())
    println("What a great name you have, ${user.name}!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    user.ageCalculation(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    println("Your age is ${user.age}; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")
    machine.countingDemonstration(scanner.nextInt())
    test()
    //scanner.nextInt()
    while (scanner.nextInt() != TestQuestinons.QUESTION1.r) {
        println("Please, try again.")
        //scanner.nextInt()
    }
    end()

}


data class Machine (val name: String = "Karl", val age: Int = 2020) {

    fun countingDemonstration (positiveNumber: Int) {
        if (positiveNumber >= 0)
            for (i in 0..positiveNumber) {
                println("$i!")
            } else println("this is not good")
    }
}

data class User (val name: String, var age: Int = 0) {

    fun ageCalculation(remainder3: Int, remainder5: Int, remainder7: Int) {
        this.age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    }
}


fun test() {
    println("Let's test your programming knowledge.")
    println(TestQuestinons.QUESTION1.questinon)
    println(TestQuestinons.QUESTION1.a1)
    println(TestQuestinons.QUESTION1.a2)
    println(TestQuestinons.QUESTION1.a3)
    println(TestQuestinons.QUESTION1.a4)
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}

enum class TestQuestinons(val questinon: String, val a1: String, val a2: String, val a3: String, val a4: String, val r: Int) {
    QUESTION1("Why do we use methods?", "1. To repeat a statement multiple times.", "2. To decompose a program into several small subroutines.",
            "3. To determine the execution time of a program.", "4. To interrupt the execution of a program.", 2)
}
