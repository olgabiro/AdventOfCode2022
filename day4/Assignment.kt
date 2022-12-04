package day4

class Assignment (val start: Int, val end: Int) {
  
  fun fullyOverlaps(other: Assignment) : Boolean {
    return this.fullyContains(other) || other.fullyContains(this)
  }

  private fun fullyContains(other: Assignment) : Boolean {
    return this.start <= other.start && this.end >= other.end
  }

  fun overlaps(other: Assignment) : Boolean {
    return this.isEarlierAndOverlaps(other) || other.isEarlierAndOverlaps(this)
  }

  private fun isEarlierAndOverlaps(other: Assignment) : Boolean {
    return this.start <= other.start && this.end >= other.start
  }

  override fun toString() : String {
    return "$start - $end"
  }
}