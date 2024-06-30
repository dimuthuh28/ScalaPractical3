object qFive extends App {
  val intList = List(22, 24, 33, 56, 11, 9, 5)

  def sumOfEvenNumbers(ints: List[Int]): Int = {
    var sum = 0
    for (num <- ints) {
      if (num % 2 == 0) {
        sum += num
      }
    }
    sum
  }

  println(sumOfEvenNumbers(intList))
}
