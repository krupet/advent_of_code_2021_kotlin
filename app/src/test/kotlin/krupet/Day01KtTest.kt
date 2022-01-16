package krupet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day01KtTest {
  @Test
  internal fun `get number of increases`() {
    val input = readInputAsInts("Day01_pt1_sample")
    assertEquals(7, part1(input))
  }

  @Test
  internal fun `get number of increases 2`() {
    val input = readInputAsInts("Day01_pt1")
    assertEquals(1766, part1(input))
  }

  @Test
  internal fun `get number of increases pt2`() {
    val input = readInputAsInts("Day01_pt2_sample")
    assertEquals(5, part2(input))
  }

  @Test
  internal fun `get number of increases pt2 2`() {
    val input = readInputAsInts("Day01_pt2")
    assertEquals(1797, part2(input))
  }
}

