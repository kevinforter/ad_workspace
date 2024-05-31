package ch.hslu.informatik.ad.einfuehrung.E1.E4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test_giveFibonacciNumber9_shouldReturn34() {

        int f = FibonacciDemo.fiboRec1(9);
        assertEquals(34, f);
    }

    @Test
    void test_giveFibonacciNumber0_shouldReturn0() {

        int f = FibonacciDemo.fiboRec1(0);
        assertEquals(0, f);
    }

    @Test
    void test_giveFibonacciNumber2_shouldReturn1() {

        int f = FibonacciDemo.fiboRec1(2);
        assertEquals(1, f);
    }

    @Test
    void test_giveFibonacciNumberLowerThan0_shouldThrowException() {

        assertThrows(StackOverflowError.class, () -> {
            int i = FibonacciDemo.fiboRec1(-1);
        });
    }
}