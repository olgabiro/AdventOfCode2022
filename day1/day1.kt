package day1

import java.io.File

fun main(args : Array<String>) {

  // val inventories : List<Inventory> = read(arrayOf(
  //   arrayOf(1000, 2000, 3000), 
  //   arrayOf(4000), 
  //   arrayOf(5000, 6000), 
  //   arrayOf(7000, 8000, 9000), 
  //   arrayOf(10000)))

  val inventories = readInventories("input.txt")

  solve(inventories)
}

private fun solve(inventories : List<Inventory>, n : Int = 3) {

  val maximumCalories = inventories.map(Inventory::getTotalCalories).maxOrNull()
  println("The maximum carried calories is $maximumCalories")

  val maximumSharedCalories = inventories
    .map(Inventory::getTotalCalories)
    .sortedDescending()
    .take(n)
    .sum()
    
  println("The top $n elves are carrying $maximumSharedCalories calories together")
}

private fun readInventories(values: Array<Array<Int>>) : List<Inventory> {
  return values.map { 
    val items = it.map { value : Int -> InventoryItem(value)}
    Inventory(items.toMutableList())
  }
}

private fun readInventories(filename: String) : List<Inventory> {
  val inventories = ArrayList<Inventory>()
  var currentInventory = Inventory()
  
  File(filename).forEachLine { line : String -> 
    if (line == EMPTY_STRING) {
      inventories.add(currentInventory)
      currentInventory = Inventory()
    } else {
      val inventoryValue = line.toInt()
      currentInventory.addItem(InventoryItem(inventoryValue))
    }
  }

  return inventories
}