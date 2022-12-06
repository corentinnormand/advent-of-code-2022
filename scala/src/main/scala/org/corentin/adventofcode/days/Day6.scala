package org.corentin.adventofcode.days

import scala.io.Source


object Day6 {

  def solution(): Unit = {
    for (line <- Source.fromResource("6.txt").getLines()) {
      println(Day6.part1(line))
      println(Day6.part2(line))
    }
  }

  def part1(input: String): Int = {
    functional(input, 4)
  }

  def part2(input: String): Int = {
    functional(input, 14)
  }


  private def functional(line: String, size: Int): Int = {
    val str = line.chars().toArray
      .map(i => i.asInstanceOf[Char])
      .sliding(size)
      .map(a => (a, a.toSet))
      .find(_._2.size == size)
      .map(_._1.mkString)
      .getOrElse("")

    line.indexOf(str
    ) + size

  }
}
