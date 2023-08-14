package Lab_8

import scala.io.StdIn.{readFloat, readInt}

object Q2 extends App {

  //lambda function
  val patternMatch: Int => String = (x: Int) => {
    x match {
      case x if (x <= 0) => "Negative/Zero";
      case x if (x % 2 == 0) => "Even Number";
      case _ => "Odd Number";
    }
  }

  printf("Enter the number: ");

  val input = readInt();
  val output: String = patternMatch(input);

  println(output);;

}
