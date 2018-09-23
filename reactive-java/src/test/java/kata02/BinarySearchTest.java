package kata02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

class BinarySearchTest {

    private BinarySearch search = new BinarySearch();

    @Test
    @DisplayName("Easy tests")
    void easyScenarios() {
        assertResult(-1, search.chop(3, new int[]{}));
        assertResult(-1, search.chop(3, new int[]{1}));
        assertResult(0, search.chop(1, new int[]{1}));
    }

    @Test
    @DisplayName("Tests of 3 items")
    void smallSets() {
        assertResult(0, search.chop(1, new int[]{1, 3, 5}));
        assertResult(1, search.chop(3, new int[]{1, 3, 5}));
        assertResult(2, search.chop(5, new int[]{1, 3, 5}));
        assertResult(-1, search.chop(0, new int[]{1, 3, 5}));
        assertResult(-1, search.chop(2, new int[]{1, 3, 5}));
        assertResult(-1, search.chop(4, new int[]{1, 3, 5}));
        assertResult(-1, search.chop(6, new int[]{1, 3, 5}));
    }

    @Test
    @DisplayName("Tests of 4")
    void mediumSets() {
        assertResult(0, search.chop(1, new int[]{1, 3, 5, 7}));
        assertResult(1, search.chop(3, new int[]{1, 3, 5, 7}));
        assertResult(2, search.chop(5, new int[]{1, 3, 5, 7}));
        assertResult(3, search.chop(7, new int[]{1, 3, 5, 7}));
        assertResult(-1, search.chop(0, new int[]{1, 3, 5, 7}));
        assertResult(-1, search.chop(2, new int[]{1, 3, 5, 7}));
        assertResult(-1, search.chop(4, new int[]{1, 3, 5, 7}));
        assertResult(-1, search.chop(6, new int[]{1, 3, 5, 7}));
        assertResult(-1, search.chop(8, new int[]{1, 3, 5, 7}));
    }

    private void assertResult(int expected, Mono<Integer> mono) {
        StepVerifier.create(mono)
            .expectNext(expected)
            .expectComplete()
            .verify();
    }
}
