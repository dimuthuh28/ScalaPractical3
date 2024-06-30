object AverageCalculator extends App {

  def calculateAverage(num1: Int, num2: Int): Double = {
    val average = (num1 + num2).toDouble / 2
    BigDecimal(average).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  val num1 = 10
  val num2 = 20
  val average = calculateAverage(num1, num2)
  println(average)
}
