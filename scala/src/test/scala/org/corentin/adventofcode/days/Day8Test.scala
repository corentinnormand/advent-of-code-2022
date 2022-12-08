package org.corentin.adventofcode.days

import org.scalatest.funsuite.AnyFunSuite

class Day8Test extends AnyFunSuite {

  test("part 1") {
    val input =
      """30373
        |25512
        |65332
        |33549
        |35390
        |""".stripMargin.split("\n").toList
    assert(Day8.part1(input) == 21)
    assert(Day8.part2(input) == 8)
  }

}
