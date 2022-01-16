package krupet

fun part1(ints: Collection<Int>): Int = ints.windowed(2).count { (a,b) -> a < b }
fun part2(ints: Collection<Int>): Int = ints.windowed(4).count { it.first() < it.last() }
