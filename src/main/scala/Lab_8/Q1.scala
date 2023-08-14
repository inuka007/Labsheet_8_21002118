package Lab_8

import scala.io.StdIn.readFloat

object Q1 extends App {
  def round(y: Double): Double = BigDecimal(y).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble;

  //lambda function
  val interest: Double => Double = (amount: Double) => {
    amount match {
      case amount if amount <= 20000 => amount * 0.02;
      case amount if amount <= 200000 => amount * 0.04;
      case amount if amount <= 2000000 => amount * 0.035;
      case amount if(amount >= 2000000) => amount * .065;
      }
  }

  printf("Enter the deposit amount: ")

  val input = readFloat();
  val output: Double = interest(input)

  print("Interest is Rs. " + round(output));;

}
