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
    void insertionSort2_return() {

        int[] unsortArr = new int[]{19, 75, 67, 21, 9};

        int[] sortedArr = Sort.insertionSort2(unsortArr);
        assertEquals(5, sortedArr.length);
    }

    @Test
    void insertionSort2_firstElement() {

        int[] unsortArr = new int[]{27, 10, 30, 63, 5, 84, 39, 43, 17, 14, 15, 15, 79, 19, 6, 15, 42, 70, 91, 70, 74, 18, 79, 80, 96, 56, 58, 32, 62, 53, 57, 98, 94, 50, 76, 88, 99, 48, 70, 52, 27, 20, 5, 59, 56, 31, 71, 39, 9, 49};

        int[] sortedArr = Sort.insertionSort2(unsortArr);
        assertEquals(5, sortedArr[0]);
    }

    @Test
    void insertionSort2_lastElement() {

        int[] unsortArr = new int[]{27, 10, 30, 63, 5, 84, 39, 43, 17, 14, 15, 15, 79, 19, 6, 15, 42, 70, 91, 70, 74, 18, 79, 80, 96, 56, 58, 32, 62, 53, 57, 98, 94, 50, 76, 88, 99, 48, 70, 52, 27, 20, 5, 59, 56, 31, 71, 39, 9, 49};

        int[] sortedArr = Sort.insertionSort2(unsortArr);
        assertEquals(99, sortedArr[sortedArr.length - 1]);
    }

    @AfterEach
    void tearDown() {
    }
}