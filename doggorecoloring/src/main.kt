import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    sc.nextInt()
    val doggosColors = sc.next()

    if(doggosColors.hasTwoSameLetters() || doggosColors.length == 1) println("Yes") else println("No")
}

private fun String.hasTwoSameLetters(): Boolean {

    val mapOfCharAndNumberOfOccurrences = this.groupingBy { it }.eachCount()

    if(mapOfCharAndNumberOfOccurrences.any { it.value > 1 }) return true

    return false
}