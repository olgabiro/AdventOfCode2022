package day3

fun create(description: String) : Rucksack {
  val halfPoint = description.length / 2
  val compartment1Description = description.substring(0, halfPoint)
  val compartment2Description = description.substring(halfPoint)

  return Rucksack(createCompartment(compartment1Description),
                  createCompartment(compartment2Description))
}

private fun createCompartment(description : String) : List<Item> {
  return description.map { Item.valueOf(it.toString()) }
}