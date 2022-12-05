package day5

import kotlin.collections.*

class CrateStack(val crates: ArrayDeque<Crate> = arrayDequeOf()) {

  fun addCrate(crate: Crate) {
    this.crates.addLast(crate)
  }

  fun removeCrate(): Crate {
    return this.crates.removeLast()
  }

  fun moveCratesTo(numberOfCrates: Int, otherStack: CrateStack) {
    repeat(numberOfCrates) { otherStack.addCrate(this.removeCrate()) }
  }

  fun getTopCrate(): Crate {
    return this.crates.last()
  }
}
