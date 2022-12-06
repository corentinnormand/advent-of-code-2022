package org.corentin.adventofcode.days

import org.scalatest.funsuite.AnyFunSuite

class Day6Test extends AnyFunSuite {

  test("should do part 1 examples") {
    val map = Map(
      ("bvwbjplbgvbhsrlpgdmjqwftvncz", 5),
      ("nppdvjthqldpwncqszvftbrmjlhg", 6),
      ("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 10),
      ("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 11)
    )

    map foreach { s => assert(Day6.part1(s._1) == s._2) }

  }

  test("should do part 2 examples ") {
    val map = Map(
      ("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 19),
      ("bvwbjplbgvbhsrlpgdmjqwftvncz", 23),
      ("nppdvjthqldpwncqszvftbrmjlhg", 23),
      ("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 29),
      ("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 26),
    )
    map foreach { s => assert(Day6.part2(s._1) == s._2) }
  }
}
