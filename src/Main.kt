import kotlin.random.Random

fun main() {
    var playerScore = 0
    var computerScore = 0

    while (true) {
        println("Выбери свой вариант:  (1 - Камень, 2 - Ножницы, 3 - Бумага):")
        val playerChoice = readLine()!!.toInt()

        val computerChoice = Random.nextInt(1, 4)

        println("Бот выбрал: : $computerChoice")

        when {
            playerChoice == computerChoice -> {
                println("Ничья, сыграйте ещё раз.")
            }
            (playerChoice == 1 && computerChoice == 2) || (playerChoice == 2 && computerChoice == 3) || (playerChoice == 3 && computerChoice == 1) -> {
                println("Ты выиграл!")
                playerScore++
            }
            else -> {
                println("Бот выиграл!")
                computerScore++
            }
        }

        println("Счет - Ты: $playerScore, Бот: $computerScore")
    }
}
