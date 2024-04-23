package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    private static final Logger LOG = LoggerFactory.getLogger(SortTest.class);

    static int[] randomArray100K;
    static int[] randomArray200K;
    static int[] randomArray300K;
    static int[] sortedArray100K;
    static int[] sortedArray200K;
    static int[] sortedArray300K;
    static int[] reversedArray100K;
    static int[] reversedArray200K;
    static int[] reversedArray300K;

    @BeforeAll
    static void setUp() {
        randomArray100K = Util.genRandomArray(100000);
        randomArray200K = Util.genRandomArray(200000);
        randomArray300K = Util.genRandomArray(300000);
        sortedArray100K = Util.genArraySorted(100000);
        sortedArray200K = Util.genArraySorted(200000);
        sortedArray300K = Util.genArraySorted(300000);
        reversedArray100K = Util.genArraySortedReverse(100000);
        reversedArray200K = Util.genArraySortedReverse(200000);
        reversedArray300K = Util.genArraySortedReverse(300000);
    }

    @Test
    void selectSort() {
        int[] unsortArr = new int[]{19, 75, 67, 21, 9};

        Sort.selectionSort(unsortArr);
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
    void measureInsertionSort2PerformanceRandomArr100K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray100K, randomArray100K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyRandom);
        long end = System.nanoTime();
        LOG.info("Time for random array of size " + randomArray100K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceRandomArr200K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray200K, randomArray200K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyRandom);
        long end = System.nanoTime();
        LOG.info("Time for random array of size " + randomArray200K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceRandomArr300K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray300K, randomArray300K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyRandom);
        long end = System.nanoTime();
        LOG.info("Time for random array of size " + randomArray300K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr100K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray100K, sortedArray100K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copySorted);
        long end = System.nanoTime();
        LOG.info("Time for sorted array of size " + sortedArray100K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr200K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray200K, sortedArray200K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copySorted);
        long end = System.nanoTime();
        LOG.info("Time for sorted array of size " + sortedArray200K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr300K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray300K, sortedArray300K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copySorted);
        long end = System.nanoTime();
        LOG.info("Time for sorted array of size " + sortedArray300K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr100K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray100K, reversedArray100K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyReversed);
        long end = System.nanoTime();
        LOG.info("Time for reversed array of size " + reversedArray100K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr200K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray200K, reversedArray200K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyReversed);
        long end = System.nanoTime();
        LOG.info("Time for reversed array of size " + reversedArray200K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr300K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray300K, reversedArray300K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyReversed);
        long end = System.nanoTime();
        LOG.info("Time for reversed array of size " + reversedArray300K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceRandomArr100K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray100K, randomArray100K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyRandom);
        long end = System.nanoTime();
        LOG.info("Time for random array of size " + randomArray100K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceRandomArr200K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray200K, randomArray200K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyRandom);
        long end = System.nanoTime();
        LOG.info("Time for random array of size " + randomArray200K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceRandomArr300K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray300K, randomArray300K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyRandom);
        long end = System.nanoTime();
        LOG.info("Time for random array of size " + randomArray300K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceSortedArr100K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray100K, sortedArray100K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copySorted);
        long end = System.nanoTime();
        LOG.info("Time for sorted array of size " + sortedArray100K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceSortedArr200K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray200K, sortedArray200K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copySorted);
        long end = System.nanoTime();
        LOG.info("Time for sorted array of size " + sortedArray200K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceSortedArr300K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray300K, sortedArray300K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copySorted);
        long end = System.nanoTime();
        LOG.info("Time for sorted array of size " + sortedArray300K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceReversedArr100K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray100K, reversedArray100K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyReversed);
        long end = System.nanoTime();
        LOG.info("Time for reversed array of size " + reversedArray100K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceReversedArr200K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray200K, reversedArray200K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyReversed);
        long end = System.nanoTime();
        LOG.info("Time for reversed array of size " + reversedArray200K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceReversedArr300K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray300K, reversedArray300K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyReversed);
        long end = System.nanoTime();
        LOG.info("Time for reversed array of size " + reversedArray300K.length + ": " + (end - start) + " ns");
    }

    @AfterEach
    void tearDown() {
    }
}