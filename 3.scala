object AverageCalculator extends App {

  def calculateAverage(num1: Int, num2: Int): Double = {
    val average = (num1 + num2) / 2.00
    average
  }

  val num1 = 10
  val num2 = 21
  val average = calculateAverage(num1, num2)
  println(f"$average%.2f")
}
