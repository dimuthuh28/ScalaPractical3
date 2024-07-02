
object ProjectOne extends App{
  def reverse(s: String): String = {
    if (s.isEmpty) ""
    else reverse(s.tail) + s.head
  }

  val input = "Hello, Dimuthu!"
  println(s"Original: $input")
  println(s"Reversed: ${reverse(input)}")

}
