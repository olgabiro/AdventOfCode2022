package day2

fun testExample() {
  val testInputs = arrayOf("A" to "Y", "B" to "X", "C" to "Z")
  val games = read(testInputs)
  println(solve(games))
}

fun part1() {
  val games = readSymbols("day2/input.txt")
  val result = solve(games)
  println("When the second column is a symbol, the game result is $result.")
}

fun part2() {
  val games = readSymbolsAndResults("day2/input.txt")
  val result = solve(games)
  println("When the second column is a result, the game result is $result.")
}

fun solve(games: List<Game>): Int {
  return games.map(Game::getScore).sum()
}
