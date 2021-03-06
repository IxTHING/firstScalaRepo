package exercises

import java.util.TimeZone

import scala.collection.mutable
import scala.io.{BufferedSource, Source}

object Main {

  var helloWorld = "Hello World"

  def returnString(input: String): String = input

  def returnAll(input: Any): Any = input

  def returnPartOfString(stringInput: String, intInput: Int): String = stringInput.substring(intInput, stringInput.length())

  def returnFullWord(s1: String, s2: String, s3: Char, s4: Char): String = s1.concat(s2).replace(s3, s4)

  def returnValue(num1: Int, num2: Int, b: Boolean): Int = if (b) {
    num1 + num2
  } else {
    num1 * num2
  }

  def returnValuePatternMatch(num1: Int, num2: Int, b: Boolean): Int = b match {
    case true => num1 + num2
    case false => num1 * num2
  }

  def printMultipleLines(word: String, value: Int) = for (i <- 1 to value) println(word)

  def printSquare(word: String, value: Int) = for (i <- 1 to value) {
    for (i <- 1 to value) {
      print(word)
    }
    println()
  }

  def inputSwap(input: AnyRef): Any = input match {
    case input: List[Any] => input.reverse
    case input: Seq[Any] => input.reverse
    case input: Array[input] => input.reverse.mkString(",")
    case input: (Any, Any) => input.swap
    case _ => "Nothing to return"
  }

  def printTimezone(location: String): Unit = {
    val id = location + "/"
    val a = TimeZone.getAvailableIDs.filter(_.startsWith(id)).map(_.stripPrefix(id)).sorted
    a.foreach(println)
  }

  def luhnAlgorithm(): Unit ={
    var num = "4992739871"
    num.reverse.toInt
    println(num.reverse)
  }

  def primesIterative(end: Int): List[Int] = {
    val primeIndices = mutable.ArrayBuffer.fill((end + 1) / 2)(1)

    val intSqrt = Math.sqrt(end).toInt
    for (i <- 3 to end by 2 if i <= intSqrt) {
      for (nonPrime <- i * i to end by 2 * i) {
        primeIndices.update(nonPrime / 2, 0)
      }
    }

    (for (i <- primeIndices.indices if primeIndices(i) == 1) yield 2 * i + 1).tail.toList
  }

  val numbers = Array(1, 2)

  val bufferedSource = Source.fromFile("C:\\Users\\Admin\\Jordan\\gitPulls\\firstScalaRepo\\src\\main\\scala\\test.txt")
  def readFromFile(file: BufferedSource): Unit ={
    for (line <- bufferedSource.getLines) {
      println(line.toUpperCase)
    }
  }
}

object SquarePrint {
  var x = 0
  var y = 0

  def characterPrint(c: Char, n: Int): Unit = {
    if (x < n) {
      print(c)
      x += 1
    } else {
      println()
      x = 0
      y += 1
    }
    if (y < n) {
      characterPrint(c, n)
    }
  }
}


