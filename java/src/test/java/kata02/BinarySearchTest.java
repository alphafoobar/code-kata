package kata02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private BinarySearch search = new BinarySearch();

    @Test
    @DisplayName("Easy tests")
    void easyScenarios() {
        assertEquals(-1, search.chop(3, new int[]{}));
        assertEquals(-1, search.chop(3, new int[]{1}));
        assertEquals(0, search.chop(1, new int[]{1}));
    }

    @Test
    @DisplayName("Tests of 3 items")
    void smallSets() {
        assertEquals(0, search.chop(1, new int[]{1, 3, 5}));
        assertEquals(1, search.chop(3, new int[]{1, 3, 5}));
        assertEquals(2, search.chop(5, new int[]{1, 3, 5}));
        assertEquals(-1, search.chop(0, new int[]{1, 3, 5}));
        assertEquals(-1, search.chop(2, new int[]{1, 3, 5}));
        assertEquals(-1, search.chop(4, new int[]{1, 3, 5}));
        assertEquals(-1, search.chop(6, new int[]{1, 3, 5}));
    }

    @Test
    @DisplayName("Tests of 4")
    void mediumSets() {
        assertEquals(0, search.chop(1, new int[]{1, 3, 5, 7}));
        assertEquals(1, search.chop(3, new int[]{1, 3, 5, 7}));
        assertEquals(2, search.chop(5, new int[]{1, 3, 5, 7}));
        assertEquals(3, search.chop(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.chop(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.chop(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.chop(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.chop(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, search.chop(8, new int[]{1, 3, 5, 7}));
    }
}
