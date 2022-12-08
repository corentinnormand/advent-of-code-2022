package org.corentin.adventofcode.days

import java.util.UUID
import scala.collection.mutable.{Map => MutableMap}

object Day7 {

  def part1(input: List[String]): Int = solution(input, 1)

  def part2(input: List[String]): Int = solution(input, 2)

  private def solution(input: List[String], part: Int): Int = {
    val cmds = MutableMap[String, Int]()
    var pwd = List[String]()
    val csize = MutableMap[String, Int]()
    for (line <- input) {
      line.split(" ") match {
        case Array("$", "cd", "/") => pwd = List[String]("/")
        case Array("$", "cd", "..") => pwd = pwd.init
        case Array("$", "cd", x) => pwd = pwd ++ List(f"$x${UUID.randomUUID()}")
        case Array("dir", _) =>
        case Array("$", "ls") =>
        case Array(size, _) => for (dir <- pwd) {
          csize.get(dir) match {
            case None => csize(dir) = size.toInt
            case Some(_) => csize(dir) += size.toInt
          }
        }
        case _ =>
      }
    }
    part match {
      case 1 => csize.values.filter(_ <= 100000).sum
      case 2 =>
        val max = 70000000
        val used = csize("/")
        val available = max - used
        val needed = 30000000

        val value = used - (max - needed)
        println((used, used - max, value))
        val list = csize.values.filter(_ >= value).toList
        println(list)
        val sorted = list.min
        sorted
    }
  }
}

