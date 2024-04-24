package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    private static final Logger LOG = LoggerFactory.getLogger(SortTest.class);

    static int[] randomArray10K;
    static int[] randomArray20K;
    static int[] randomArray40K;
    static int[] sortedArray10K;
    static int[] sortedArray20K;
    static int[] sortedArray40K;
    static int[] reversedArray10K;
    static int[] reversedArray20K;
    static int[] reversedArray40K;

    @BeforeAll
    static void setUp() {
        randomArray10K = Util.genRandomArray(10000);
        randomArray20K = Util.genRandomArray(20000);
        randomArray40K = Util.genRandomArray(40000);
        sortedArray10K = Util.genArraySorted(10000);
        sortedArray20K = Util.genArraySorted(20000);
        sortedArray40K = Util.genArraySorted(40000);
        reversedArray10K = Util.genArraySortedReverse(10000);
        reversedArray20K = Util.genArraySortedReverse(20000);
        reversedArray40K = Util.genArraySortedReverse(40000);
    }

    @Ignore
    void selectSort() {
        int[] unsortArr = new int[]{19, 71, 67, 21, 9, 21};

        long start = System.nanoTime();
        int[] sortedArr = Sort.selectionSort(unsortArr);
        long end = System.nanoTime();

        LOG.info(Arrays.toString(sortedArr));

        long time = end - start;
        LOG.info("Time: " + time + " ns");

        assertEquals(9, sortedArr[0]);
        assertEquals(71, sortedArr[sortedArr.length - 1]);
    }

    @Ignore
    void test_return() {

        int[] unsortArr = new int[]{19, 75, 67, 21, 9};

        int[] sortedArr = Sort.bubbleSort(unsortArr);
        assertEquals(5, sortedArr.length);

        LOG.info(Arrays.toString(sortedArr));
    }

    @Ignore
    void test_firstElement() {

        int[] unsortArr = new int[]{19, 75, 67, 21, 9};

        int[] sortedArr = Sort.insertionSort2(unsortArr);
        assertEquals(9, sortedArr[0]);

        LOG.info(Arrays.toString(sortedArr));
    }

    @Ignore
    void test_lastElement() {

        int[] unsortArr = new int[]{19, 75, 67, 21, 9};

        int[] sortedArr = Sort.insertionSort2(unsortArr);
        assertEquals(75, sortedArr[sortedArr.length - 1]);

        LOG.info(Arrays.toString(sortedArr));
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceRandomArr10K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray10K, randomArray10K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyRandom);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for random array of size " + randomArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceRandomArr20K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray20K, randomArray20K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyRandom);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for random array of size " + randomArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceRandomArr40K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray40K, randomArray40K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyRandom);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for random array of size " + randomArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr10K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray10K, sortedArray10K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copySorted);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for sorted array of size " + sortedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr20K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray20K, sortedArray20K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copySorted);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for sorted array of size " + sortedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceSortedArr40K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray40K, sortedArray40K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copySorted);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for sorted array of size " + sortedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr10K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray10K, reversedArray10K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyReversed);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for reversed array of size " + reversedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr20K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray20K, reversedArray20K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyReversed);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for reversed array of size " + reversedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort2PerformanceReversedArr40K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray40K, reversedArray40K.length);
        long start = System.nanoTime();
        Sort.insertionSort2(copyReversed);
        long end = System.nanoTime();
        LOG.info("Insert Sort 2 for reversed array of size " + reversedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceRandomArr10K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray10K, randomArray10K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyRandom);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for random array of size " + randomArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceRandomArr20K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray20K, randomArray20K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyRandom);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for random array of size " + randomArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceRandomArr40K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray40K, randomArray40K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyRandom);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for random array of size " + randomArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceSortedArr10K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray10K, sortedArray10K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copySorted);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for sorted array of size " + sortedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceSortedArr20K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray20K, sortedArray20K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copySorted);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for sorted array of size " + sortedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceSortedArr40K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray40K, sortedArray40K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copySorted);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for sorted array of size " + sortedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceReversedArr10K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray10K, reversedArray10K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyReversed);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for reversed array of size " + reversedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceReversedArr20K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray20K, reversedArray20K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyReversed);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for reversed array of size " + reversedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureInsertionSort3PerformanceReversedArr40K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray40K, reversedArray40K.length);
        long start = System.nanoTime();
        Sort.insertionSort3(copyReversed);
        long end = System.nanoTime();
        LOG.info("Insert Sort 3 for reversed array of size " + reversedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceRandomArr10K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray10K, randomArray10K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copyRandom);
        long end = System.nanoTime();
        LOG.info("Select Sort for random array of size " + randomArray10K.length + ": " + (end - start) + " ns");
    }
    @RepeatedTest(5)
    void measureSelectSortPerformanceRandomArr20K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray20K, randomArray20K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copyRandom);
        long end = System.nanoTime();
        LOG.info("Select Sort for random array of size " + randomArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceRandomArr40K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray40K, randomArray40K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copyRandom);
        long end = System.nanoTime();
        LOG.info("Select Sort for random array of size " + randomArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceSortedArr10K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray10K, sortedArray10K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copySorted);
        long end = System.nanoTime();
        LOG.info("Select Sort for sorted array of size " + sortedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceSortedArr20K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray20K, sortedArray20K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copySorted);
        long end = System.nanoTime();
        LOG.info("Select Sort for sorted array of size " + sortedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceSortedArr40K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray40K, sortedArray40K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copySorted);
        long end = System.nanoTime();
        LOG.info("Select Sort for sorted array of size " + sortedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceReversedArr10K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray10K, reversedArray10K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copyReversed);
        long end = System.nanoTime();
        LOG.info("Select Sort for reversed array of size " + reversedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceReversedArr20K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray20K, reversedArray20K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copyReversed);
        long end = System.nanoTime();
        LOG.info("Select Sort for reversed array of size " + reversedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureSelectSortPerformanceReversedArr40K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray40K, reversedArray40K.length);
        long start = System.nanoTime();
        Sort.selectionSort(copyReversed);
        long end = System.nanoTime();
        LOG.info("Select Sort for reversed array of size " + reversedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceRandomArr10K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray10K, randomArray10K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copyRandom);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for random array of size " + randomArray10K.length + ": " + (end - start) + " ns");
    }
    @RepeatedTest(5)
    void measureBubbleSortPerformanceRandomArr20K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray20K, randomArray20K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copyRandom);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for random array of size " + randomArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceRandomArr40K() {

        // Measure performance for random array
        int[] copyRandom = Arrays.copyOf(randomArray40K, randomArray40K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copyRandom);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for random array of size " + randomArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceSortedArr10K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray10K, sortedArray10K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copySorted);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for sorted array of size " + sortedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceSortedArr20K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray20K, sortedArray20K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copySorted);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for sorted array of size " + sortedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceSortedArr40K() {

        // Measure performance for sorted array
        int[] copySorted = Arrays.copyOf(sortedArray40K, sortedArray40K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copySorted);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for sorted array of size " + sortedArray40K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceReversedArr10K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray10K, reversedArray10K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copyReversed);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for reversed array of size " + reversedArray10K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceReversedArr20K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray20K, reversedArray20K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copyReversed);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for reversed array of size " + reversedArray20K.length + ": " + (end - start) + " ns");
    }

    @RepeatedTest(5)
    void measureBubbleSortPerformanceReversedArr40K() {

        // Measure performance for reversed array
        int[] copyReversed = Arrays.copyOf(reversedArray40K, reversedArray40K.length);
        long start = System.nanoTime();
        Sort.bubbleSort(copyReversed);
        long end = System.nanoTime();
        LOG.info("Bubble Sort for reversed array of size " + reversedArray40K.length + ": " + (end - start) + " ns");
    }
}