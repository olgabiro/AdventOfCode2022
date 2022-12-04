package day3

import java.io.File

fun read(descriptions: Array<String>) : List<Rucksack> {
 return descriptions.map { create(it) }
}

fun readFromFile(fileName: String) : List<Rucksack> {
  return File(fileName).readLines().map { line -> create(line) }
}

fun readGroupsFromFile(fileName: String) : List<RucksackGroup> {
  val groups = ArrayList<RucksackGroup>()
  val currentGroupDescriptions = ArrayList<String>()

  File(fileName).readLines().map { line -> 
    currentGroupDescriptions.add(line)
    if (currentGroupDescriptions.size == 3) {
      
      val currentGroup = create(currentGroupDescriptions[0],
                                currentGroupDescriptions[1],
                                currentGroupDescriptions[2])
      groups.add(currentGroup)
      currentGroupDescriptions.clear()
    } 
  }

  return groups
}