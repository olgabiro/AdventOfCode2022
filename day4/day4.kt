package day4

fun solveExample() {
  val descriptions = listOf("2-4,6-8",
                             "2-3,4-5",
                             "5-7,7-9",
                             "2-8,3-7",
                             "6-6,4-6",
                             "2-6,4-8")

  val assignmentPairs = read(descriptions)
  val result = findNumberOfFullyOverlappingAssignments(assignmentPairs)
  val result2 = findNumberOfOverlappingAssignments(assignmentPairs)
  println("Example: There were $result fully overlapping pairs")
  println("Example: There were $result2 overlapping pairs")
}

fun findNumberOfFullyOverlappingAssignments(assignments: List<Pair<Assignment, Assignment>>) : Int {
  return assignments.filter { pair -> pair.first.fullyOverlaps(pair.second) }
    .count()
}

fun findNumberOfOverlappingAssignments(assignments: List<Pair<Assignment, Assignment>>) : Int {
  return assignments.filter { pair -> pair.first.overlaps(pair.second) }
    .count()
}

fun solvePart1() {

  val assignmentPairs = readFromFile("day4/input.txt")
  val result = findNumberOfFullyOverlappingAssignments(assignmentPairs)

  println("Part 1: There were $result fully overlapping pairs")
}

fun solvePart2() {

  val assignmentPairs = readFromFile("day4/input.txt")
  val result = findNumberOfOverlappingAssignments(assignmentPairs)

  println("Part 1: There were $result overlapping pairs")
}