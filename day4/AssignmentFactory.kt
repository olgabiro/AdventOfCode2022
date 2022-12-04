package day4

fun create(description: String) : Assignment {
  val values = description.split("-")
  val start = values[0].toInt()
  val end = values[1].toInt()
  return Assignment(start, end)
}