import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numberOfStrings = sc.nextInt()
    repeat(numberOfStrings) {
        var nextString = sc.next()
        when {
            nextString.isImpossibleToRearrange() -> println(-1)
            nextString.isPalindrome() -> {
                do {
                    nextString = nextString.shuffle()
                } while (nextString.isPalindrome())
                println(nextString)
            }
            else -> println(nextString)
        }
    }
}

private fun String.shuffle(): String {
    val charList = this.toMutableList()
    charList.shuffle()
    return String(charList.toCharArray())
}

private fun String.isImpossibleToRearrange(): Boolean = this.hasSameLetters() || this.length == 1

private fun String.hasSameLetters(): Boolean {
    val chars = this.toCharArray()
    val firstChar = chars.first()

    chars.forEach {
        when {
            it != firstChar -> return false
        }
    }

    return true
}

private fun String.isPalindrome(): Boolean = this == this.reversed()
