package ch.hslu.informatik.ad.suchen.A4.E2;

import org.junit.jupiter.api.Test;

import static ch.hslu.informatik.ad.suchen.A4.E2.OptimizedSearch.stateSearch;
import static org.junit.jupiter.api.Assertions.*;

class OptimizedSearchTest {

    @Test
    void stateSearchTest_PaternFound() {
        int index = stateSearch("BNMANANASZUW");
        assertAll(
                () -> assertTrue(index > -1),
                () -> assertEquals(3, index)
        );
    }

    @Test
    void stateSearchTest_PaternFoundAt0() {
        int index = stateSearch("ANANASZUW");
        assertAll(
                () -> assertTrue(index > -1),
                () -> assertEquals(0, index)
        );
    }

    @Test
    void stateSearchTest_PaternNotFound() {
        int index = stateSearch("BNMANANA0SZUW");
        assertAll(
                () -> assertEquals(-1, index)
        );
    }
}