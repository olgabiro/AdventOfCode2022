package day1

class Inventory(val items: MutableList<InventoryItem> = mutableListOf()) {

  fun getTotalCalories(): Int {
    return this.items.map { item: InventoryItem -> item.calories }.sum()
  }

  fun addItem(item: InventoryItem) {
    this.items.add(item)
  }

  fun log() {
    println(this.getTotalCalories())
  }
}
