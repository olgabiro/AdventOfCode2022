package day4

import java.io.File

fun read(descriptions: List<String>) : List<Pair<Assignment, Assignment>> {
  return descriptions.map { description -> 
    val separatedDescriptions = description.split(",")
    create(separatedDescriptions[0]) to create(separatedDescriptions[1]) 
  }
}

fun readFromFile(fileName : String) : List<Pair<Assignment, Assignment>> {
  return read(File(fileName).readLines())
}