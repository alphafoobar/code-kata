package kata02

import chop
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class BinarySearchTest {

    @Test
    @DisplayName("Easy tests")
    fun easyScenarios() {
        assertEquals(-1, chop( key=3, a=intArrayOf()))
        assertEquals(-1, chop( key=3, a=intArrayOf(1)))
        assertEquals(0, chop( key=1, a=intArrayOf(1)))
    }

    @Test
    @DisplayName("Tests of 3 items")
    fun smallSets() {
        assertEquals(0, chop( key=1, a=intArrayOf(1, 3, 5)))
        assertEquals(1, chop( key=3, a=intArrayOf(1, 3, 5)))
        assertEquals(2, chop( key=5, a=intArrayOf(1, 3, 5)))
        assertEquals(-1, chop( key=0, a=intArrayOf(1, 3, 5)))
        assertEquals(-1, chop( key=2, a=intArrayOf(1, 3, 5)))
        assertEquals(-1, chop( key=4, a=intArrayOf(1, 3, 5)))
        assertEquals(-1, chop( key=6, a=intArrayOf(1, 3, 5)))
    }

    @Test
    @DisplayName("Tests of 4")
    fun mediumSets() {
        assertEquals(0, chop( key=1, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(1, chop( key=3, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(2, chop( key=5, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(3, chop( key=7, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop( key=0, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop( key=2, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop( key=4, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop( key=6, a=intArrayOf(1, 3, 5, 7)))
        assertEquals(-1, chop( key=8, a=intArrayOf(1, 3, 5, 7)))
    }
}
