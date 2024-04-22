package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    private static final Logger LOG = LoggerFactory.getLogger(SortTest.class);

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

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceRandomArr() {

        int[] sizes = new int[]{100000, 200000, 400000};
        for (int size : sizes) {
            int[] randomArray = Util.genRandomArray(size);

            // Measure performance for random array
            int[] copyRandom = Arrays.copyOf(randomArray, randomArray.length);
            long start = System.nanoTime();
            Sort.insertionSort2(copyRandom);
            long end = System.nanoTime();
            LOG.info("Time for random array of size " + size + ": " + (end - start) + " ns");
        }
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr() {

        int[] sizes = new int[]{100000, 200000, 400000};
        for (int size : sizes) {
            int[] sortedArray = Util.genRandomArraySorted(size);

            // Measure performance for sorted array
            int[] copySorted = Arrays.copyOf(sortedArray, sortedArray.length);
            long start = System.nanoTime();
            Sort.insertionSort2(copySorted);
            long end = System.nanoTime();
            LOG.info("Time for sorted array of size " + size + ": " + (end - start) + " ns");
        }
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr() {
        int[] sizes = new int[]{100000, 200000, 400000};
        for (int size : sizes) {
            int[] reversedArray = Util.genRandomArraySortedBack(size);

            // Measure performance for reversed array
            int[] copyReversed = Arrays.copyOf(reversedArray, reversedArray.length);
            long start = System.nanoTime();
            Sort.insertionSort2(copyReversed);
            long end = System.nanoTime();
            LOG.info("Time for reversed array of size " + size + ": " + (end - start) + " ns");
        }
    }

    @AfterEach
    void tearDown() {
    }
}