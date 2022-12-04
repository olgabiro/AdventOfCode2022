package day3

fun solveExample() {
  val descriptions = arrayOf("vJrwpWtwJgWrhcsFMMfFFhFp",
                             "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                             "PmmdzqPrVvPwwTWBwg",
                             "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                             "ttgJtRGJQctTZtZT",
                             "CrZsJsPPZsGzwwsLwLmpwMDw")  
  val rucksacks = read(descriptions) 
  val solution = solve(rucksacks)
  println("Example: The sum of priorities of duplicate items is $solution")

  val groups = listOf(create("vJrwpWtwJgWrhcsFMMfFFhFp",
                            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
                            "PmmdzqPrVvPwwTWBwg"), 
                      create("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
                            "ttgJtRGJQctTZtZT",
                            "CrZsJsPPZsGzwwsLwLmpwMDw"))
  val result = solveForGroups(groups)
  println("Example: The sum of priorities of group badges is $result")
}

fun solvePart1() {
  val rucksacks = readFromFile("day3/input.txt") 
  val solution = solve(rucksacks)
  println("Part 1: The sum of priorities of duplicate items is $solution")
}

fun solvePart2() {
  val groups = readGroupsFromFile("day3/input.txt") 
  val solution = solveForGroups(groups)
  println("Part 2: The sum of priorities of group badges is $solution")
}

private fun solve(rucksacks: List<Rucksack>) : Int {
  return rucksacks.map(Rucksack::findSharedItems)
    .map(Set<Item>::first)
    .map{ item -> item.value }
    .sum()
}

private fun solveForGroups(groups: List<RucksackGroup>) : Int {
  return groups.map(RucksackGroup::badge)
    .map{ item -> item.value }
    .sum()
}