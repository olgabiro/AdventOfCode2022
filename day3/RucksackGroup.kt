package day3

class RucksackGroup (val rucksack1 : Rucksack, 
                     val rucksack2 : Rucksack,
                     val rucksack3: Rucksack) {

  val badge : Item

  init {
    val sharedItems = this.rucksack1.findAllItems()
      .intersect(this.rucksack2.findAllItems())
      .intersect(this.rucksack3.findAllItems())

    if (sharedItems.size > 1) {
      println("More than one potential badge detected: $sharedItems")
    }
      
    this.badge = sharedItems.first()
  }
}