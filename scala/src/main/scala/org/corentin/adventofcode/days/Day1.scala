package org.corentin.adventofcode.days

import scala.io.Source

class Day1 {
  def part1(): Unit = {
    var elves = Array(0)

    for (file <- Source.fromResource("1.txt").getLines()) {
      val lastIndex = elves.length - 1
      if (file.isEmpty) {
        elves = elves :+ 0
      } else {
        elves.update(lastIndex, elves(lastIndex) + file.toInt)
      }
    }

    println(elves.sorted(Ordering.Int.reverse)(0))
  }

}
