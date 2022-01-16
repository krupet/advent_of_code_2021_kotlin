package krupet

import java.io.File

//  use println(System.getProperty("user.dir")) to get current dir
fun readInputAsInts(name:String): Collection<Int> {
  return File("src/test/resources", "$name.txt").readLines().map(Integer::valueOf)
}