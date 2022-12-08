package org.corentin.adventofcode.days

import org.scalatest.funsuite.AnyFunSuite


class Day7Test extends AnyFunSuite {
  test("example part 1") {
    val input =
      """$ cd /
        |$ ls
        |dir a
        |14848514 b.txt
        |8504156 c.dat
        |dir d
        |$ cd a
        |$ ls
        |dir e
        |29116 f
        |2557 g
        |62596 h.lst
        |$ cd e
        |$ ls
        |584 i
        |$ cd ..
        |$ cd ..
        |$ cd d
        |$ ls
        |4060174 j
        |8033020 d.log
        |5626152 d.ext
        |7214296 k""".stripMargin

    assert(Day7.part1(input.split("\n").toList) == 95437)
    assert(Day7.part2(input.split("\n").toList) == 24933642)

  }
}
