
object MaxCalorieElfFinderJob extends App{
  val lines = MaxCalorieElfFinder.openFile("/Users/curnowl/Developer/AdventOfCode2022/day_1_calories/src/main/resources/elf_data.txt")
//  println(lines)
  val elfTotals = MaxCalorieElfFinder.elvesCalorieTotaller(lines)
//  separateLines.map{ elf => println(elf) }
  println(MaxCalorieElfFinder.getMaxCalories(elfTotals))
  val topThree = MaxCalorieElfFinder.getTopThreeBigElves(elfTotals)
  topThree.map(elf => println(elf))
  println(topThree.sum)
}
