package org.corentin.adventofcode

import org.corentin.adventofcode.days.Day7

import scala.io.Source

class Main

object Main {
  def main(array: Array[String]): Unit = {

    println(Day7.part1(Source.fromResource("7.txt").getLines().toList))
    println(Day7.part2(Source.fromResource("7.txt").getLines().toList))
  }

}
