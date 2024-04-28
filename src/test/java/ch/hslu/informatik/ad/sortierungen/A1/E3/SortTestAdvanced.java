package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SortTestAdvanced {

    private static final Logger LOG = LoggerFactory.getLogger(SortTestAdvanced.class);

    @BeforeAll
    static void setUp() {

    }

    @AfterAll
    static void tearDown() {

    }

    @ParameterizedTest
    @MethodSource("provideArrays")
    void test_return(int[] a) {

        int[] unsortArr = a;
        Arrays.sort(a);

        long start = System.nanoTime();
        int[] sortedArr = Sort.bubbleSort(unsortArr);
        long end = System.nanoTime();
        assertArrayEquals(a, sortedArr, "Array didn't sort properly");

        long time = end - start;
        LOG.info("Time for function: " + time + " ns");
        LOG.info(Arrays.toString(sortedArr));

        printMdTable(time, 10000);
    }

    static Stream<Arguments> provideArrays() {
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        return Stream.of(
                Arguments.of(Util.genRandomArray((int)(Math.random() * range) + min))
        );
    }

    static void printMdTable(long time, int n) {
        System.out.printf("---------------------------------------%n");
        System.out.printf("            Table with Time            %n");
        System.out.printf("---------------------------------------%n");
        System.out.printf("| %-11s | %-8s | %10s |%n", "TEST", "n-ARRAY", "TIME (ns)");
        System.out.printf("---------------------------------------%n");

        System.out.printf("| %-11s | %-8s | %10s |%n", "Bubble Sort", n / 1000 + " k" ,  time);

        System.out.printf("---------------------------------------%n");
    }
}
