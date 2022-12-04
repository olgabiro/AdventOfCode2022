package day2

enum class Symbol(val score: Int) {
  ROCK(1),
  PAPER(2),
  SCISSORS(3);

  val winsOver : Symbol
  get() = when (this) {
    ROCK -> SCISSORS
    PAPER -> ROCK
    SCISSORS -> PAPER
  }

  val losesTo: Symbol
  get() = when (this) {
    ROCK -> PAPER
    PAPER -> SCISSORS
    SCISSORS -> ROCK
  }

  fun drawsWith(other: Symbol): Boolean {
    return this == other
  }

  fun beats(other: Symbol): Boolean {
    return this.winsOver == other
  }
}
