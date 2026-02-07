package oop_98358_meylanialfatikha.week01

fun main(args: Array<String>) {
    val studentName = "Alice"
    val score = 85

    println("Student: $studentName")
    println("Score: $score")

    val grade = when {
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 55 -> "C"
        score >= 40 -> "D"
        else -> "E"
    }

    println("Grade: $grade")
}