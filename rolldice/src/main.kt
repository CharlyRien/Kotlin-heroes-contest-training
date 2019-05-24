import java.util.Scanner
import kotlin.math.min

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    //arrayOf("8","13","9")
    val yellowOrnaments = sc.nextInt()
    val blueOrnaments = sc.nextInt()
    val redOrnaments = sc.nextInt()

    println(3 * min(yellowOrnaments, min(blueOrnaments, redOrnaments - 1) - 1) + 3)
}
