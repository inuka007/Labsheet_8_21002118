package Lab_8

import scala.io.StdIn.{readFloat, readInt}

object Q3 extends App {

  //lambda functions
  val toUpper: String => String = (x: String) => x.toUpperCase();
  val toLower: String => String = (x: String) => x.toLowerCase();

  def formatNames(name: String, format: String): String = {
    format match {
      case x if x == "alluppercase" => toUpper(name)
      case x if x == "First2Uppercase" => toUpper(name.substring(0, 2)) + toLower(name.substring(2, name.length))
      case x if x == "alllowercase" => toLower(name)
      case x if x == "firstandlastupper" => toUpper(name.head.toString) + toLower(name.substring(1, name.length - 1)) + toUpper(name.substring(name.length - 1))
    }
  }

  var names: List[String] = List("Benny", "Niroshan", "Saman", "Kumara")
  var formats: List[String] = List("alluppercase", "First2Uppercase", "alllowercase", "firstandlastupper")
  var i: Int = 0
  while (i < names.length) {
    println("original : " + names(i) + " => After format : " + formatNames(names(i), formats(i)))
    i = i + 1
  }
}

