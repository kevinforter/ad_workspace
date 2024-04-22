package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testInsertionSort2() {

        int[] unsortArr = new int[]{5,4,6,23,17,2,37};

        Sort.insertionSort2(unsortArr);

    }

    @AfterEach
    void tearDown() {
    }
}