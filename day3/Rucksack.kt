package day3

class Rucksack(val compartment1 : List<Item>, 
               val compartment2 : List<Item>) {

  fun findSharedItems() : Set<Item> {
    return this.compartment1.intersect(this.compartment2)
  }

  fun findAllItems() : Set<Item> {
    return this.compartment1.union(this.compartment2)
  }
}