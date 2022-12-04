package day2

import java.io.File

fun readSymbols(filename: String) : List<Game> {
  val games = ArrayList<Game>()
  File(filename).forEachLine { line : String ->
    val symbols = line.split("").filter(String::isNotBlank)
    val opponent = transform(symbols[0])
    val mine = transform(symbols[1])
    games.add(Game(opponent, mine))
  }

  return games
}

fun readSymbolsAndResults(filename: String) : List<Game> {
  val games = ArrayList<Game>()
  File(filename).forEachLine { line : String ->
    val symbols = line.split("").filter(String::isNotBlank)
    val opponent = transform(symbols[0])
    val mine = findSymbolBasedOnResult(opponent, symbols[1])
    games.add(Game(opponent, mine))
  }

  return games
}

private fun findSymbolBasedOnResult(opponent: Symbol, result: String) : Symbol {
  return when(result) {
    "X" -> opponent.winsOver
    "Y" -> opponent
    "Z" -> opponent.losesTo
    else -> throw IllegalArgumentException("Invalid result: '$result'")
  }
}

fun read(gameInputs: Array<Pair<String, String>>) : List<Game> {
  return gameInputs.map { gameInput -> 
    val opponent = transform(gameInput.first)
    val mine = transform(gameInput.second)
    Game(opponent, mine)
  }
}

fun transform(input: String) : Symbol {
  return when (input) {
    "A", "X" -> Symbol.ROCK
    "B", "Y" -> Symbol.PAPER
    "C", "Z" -> Symbol.SCISSORS
    else -> throw IllegalArgumentException("Invalid symbol: '$input'")
  }
}

