package ch.hslu.informatik.ad.sortierungen.A2.E2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    private static final Logger LOG = LoggerFactory.getLogger(SortTest.class);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @MethodSource("provideChars")
    void quickSortUNO(char[] a) {

        LOG.info("Array before sort: " + Arrays.toString(a));
        Sort.quickSort(a, 0, 9);
        LOG.info("Array after sort: " + Arrays.toString(a));

        char[] expectedArr = new char[]{'a', 'b', 'c', 'h', 'i', 'j', 'p', 'r', 't', 'z'};

        assertAll(
                () -> assertNotNull(a, "Array shouldn't be empty"),
                () -> assertArrayEquals(expectedArr, a, "Array not sorted")
        );
    }

    @ParameterizedTest
    @MethodSource("provideChars")
    void quickSortDUE(char[] a) {

        LOG.info("Array before sort: " + Arrays.toString(a));
        Sort.quickSort(a);
        LOG.info("Array after sort: " + Arrays.toString(a));
        char[] expectedArr = new char[]{'a', 'b', 'c', 'h', 'i', 'j', 'p', 'r', 't', 'z'};

        assertAll(
                () -> assertNotNull(a, "Array shouldn't be empty"),
                () -> assertArrayEquals(expectedArr, a, "Array not sorted")
        );
    }

    @Test
    void quickSortWithRandomArray() {

        char[] a = Util.randomChars(5);
        char[] b = Arrays.copyOf(a, a.length);

        LOG.info("Array before sort: " + Arrays.toString(a));
        Sort.quickSort(a);
        LOG.info("Array after sort: " + Arrays.toString(a));
        Arrays.sort(b);

        assertAll(
                () -> assertNotNull(a, "Array shouldn't be empty"),
                () -> assertArrayEquals(b, a, "Array not sorted")
        );

    }

    @Test
    void testUtil() {
        char[] a = Util.randomChars(5);
        LOG.info(Arrays.toString(a));
    }

    static Stream<Arguments> provideChars() {
        return Stream.of(
                Arguments.of(new char[]{'a', 'c', 'h', 'r', 't', 'j', 'b', 'i', 'z', 'p'})
                // Add more char arrays if needed
        );
    }

}