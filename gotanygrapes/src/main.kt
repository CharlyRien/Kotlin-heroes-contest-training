import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val (grapesAndrewWants, grapesDmitryWants, grapesMichalWants) = Array(3) { sc.nextInt() }
    val (numberOfGreenGrapes, numberOfPurpleGrapes, numberOfBlackGrapes) = Array(3) { sc.nextInt() }

    val andrew = PersonWhoEatsFruits(grapesAndrewWants)
    val dmitry = PersonWhoEatsFruits(grapesDmitryWants)
    val michal = PersonWhoEatsFruits(grapesMichalWants)

    var answer = "YES"

    val numberTotalOfGrapes = numberOfBlackGrapes + numberOfGreenGrapes + numberOfPurpleGrapes

    when {
        numberOfGreenGrapes < andrew.numberOfWantedFruits ->  answer = "NO"
        numberOfPurpleGrapes + (numberOfGreenGrapes - grapesAndrewWants) < dmitry.numberOfWantedFruits -> answer = "NO"
        numberTotalOfGrapes - (dmitry.numberOfWantedFruits + andrew.numberOfWantedFruits) < michal.numberOfWantedFruits -> answer = "NO"
    }

    println(answer)
}

class PersonWhoEatsFruits(val numberOfWantedFruits: Int)