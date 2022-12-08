package org.corentin.adventofcode

import org.corentin.adventofcode.days.Day8

import scala.io.Source

class Main

object Main {
  def main(array: Array[String]): Unit = {

    println(Day8.part1(Source.fromResource("8.txt").getLines().toList))
    println(Day8.part2(Source.fromResource("8.txt").getLines().toList))
  }

}
