package org.corentin.adventofcode.days

import scala.collection.mutable.{ListBuffer, Map => MutableMap}

object Day8 {

  def part1(input: List[String]): Int = {
    val rows = toList(input)
    var count = 0
    for (i <- Range(0, rows.length)) {
      for (j <- Range(0, rows(i).length)) {
        if (i == 0 || i == rows.length - 1 || j == 0 || j == rows(i).length - 1) {
          count += 1
        } else {
          val tree = rows(i)(j)
          val right = rows(i).slice(j + 1, rows.head.length)
          val left = rows(i).slice(0, j)
          val up = rows.slice(0, i).map(b => b(j))
          val down = rows.slice(i + 1, rows.length).map(b => b(j))
          if (tree > right.max || tree > left.max || tree > up.max || tree > down.max) {
            count += 1
          }
        }
      }
    }
    count
  }

  def part2(input: List[String]): Int = {
    val rows = toList(input)
    var maxViewDistance = 0
    for (i <- Range(0, rows.length)) {
      for (j <- Range(0, rows(i).length)) {
        val tree = rows(i)(j)
        val right = rows(i).slice(j + 1, rows.head.length)
        val left = rows(i).slice(0, j).reverse
        val down = rows.slice(i + 1, rows.length).map(b => b(j))
        val up = rows.slice(0, i).map(b => b(j)).reverse
        val viewDistance_ = viewDistance(tree, right) * viewDistance(tree, left) * viewDistance(tree, up) * viewDistance(tree, down)
        if (viewDistance_ > maxViewDistance) {
          maxViewDistance = viewDistance_
        }


      }
    }
    maxViewDistance
  }


  private def toList(input: List[String]) = {
    input.map(_.chars().toArray.map(_.asInstanceOf[Char]).map(_.asDigit).toList)
  }

  private def viewDistance(size: Int, trees: List[Int]): Int = {
    for ((tree, index) <- trees.zipWithIndex) {
      if (tree >= size) {
        return index + 1
      }
    }
    trees.length
  }
}

