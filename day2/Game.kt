package day2

class Game(val opponent: Symbol, val mine: Symbol) {

  companion object {
    private const val LOSS_SCORE = 0
    private const val DRAW_SCORE = 3
    private const val WIN_SCORE = 6
  }

  fun getScore(): Int {
    var score = mine.score

    if (mine.drawsWith(opponent)) {
      score += DRAW_SCORE
    } else if (mine.beats(opponent)) {
      score += WIN_SCORE
    } else {
      score += LOSS_SCORE
    }

    return score
  }
}
