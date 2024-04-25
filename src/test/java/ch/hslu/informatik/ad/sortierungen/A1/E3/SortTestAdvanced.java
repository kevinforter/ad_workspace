package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SortTestAdvanced {

    private static final Logger LOG = LoggerFactory.getLogger(SortTestAdvanced.class);

    @BeforeAll
    static void setUp() {

    }

    @AfterAll
    static void tearDown() {

    }

    @Ignore
    void test_return() {

        int[] unsortArr = new int[]{19, 75, 67, 21, 9};

        int[] sortedArr = Sort.bubbleSort(unsortArr);
        assertEquals(5, sortedArr.length);

        LOG.info(Arrays.toString(sortedArr));
    }
}
