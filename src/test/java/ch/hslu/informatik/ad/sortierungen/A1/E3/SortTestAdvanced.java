package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
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
    void test_return(int[] unsortArr) {

        long start = System.nanoTime();
        int[] sortedArr = Sort.bubbleSort(unsortArr);
        long end = System.nanoTime();
        assertEquals(5, sortedArr.length);

        long time = end - start;
        LOG.info("Time for function: " + time + " ns");
        LOG.info(Arrays.toString(sortedArr));
    }

    static Stream<Arguments> provideArrays() {
        return Stream.of(
                Arguments.of(new int[]{19, 75, 67, 21, 9})
        );
    }
}
