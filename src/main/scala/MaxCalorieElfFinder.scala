import scala.io.Source

object MaxCalorieElfFinder {
  def openFile(filename: String): String = {
    val dataSource = Source.fromFile(filename)
    val lines: String = dataSource.mkString
    dataSource.close
    lines
  }

  def elvesCalorieTotaller(string: String): Array[String] = {
    /* Separate calorie value sets by elf
    For each elf, separate calories, convert to int, sum those; make string because return type
    has to be the same
    */
    val elves: Array[String] = string.split("\n\n")
    elves.map{elf: String => elf.split("\n").map(calorie => calorie.toInt).sum.toString}
  }

  def getMaxCalories(calorieTotals: Array[String]): Int = {
    calorieTotals.map{
      total => total.toInt
    }.reduceLeft(_ max _)
  }

  def getTopThreeBigElves(calorieTotals: Array[String]): Array[Int] = {
    calorieTotals.map {maxKcalPerElf => maxKcalPerElf.toInt}.sorted.reverse.take(3)
  }
}
