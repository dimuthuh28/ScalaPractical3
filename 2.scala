object FilterStrings extends App {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  val input = List("Scala", "Programming", "Fun", "Education", "Filter", "Example")
  val result = filterLongStrings(input)
  println(s"Original list: $input")
  println(s"Filtered list: $result")
}
