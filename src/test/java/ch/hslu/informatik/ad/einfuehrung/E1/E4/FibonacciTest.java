package ch.hslu.informatik.ad.einfuehrung.E1.E4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void test_giveFibonacciNumber9_shouldReturn34() {

        int fib1 = FibonacciDemo.fiboRec1(9);
        int fib2 = FibonacciDemo.fiboRec2(9);

        assertAll(
                () -> assertEquals(34, fib1),
                () -> assertEquals(34, fib2)
        );
    }

    @Test
    void test_giveFibonacciNumber0_shouldReturn0() {

        int fib1 = FibonacciDemo.fiboRec1(0);
        int fib2 = FibonacciDemo.fiboRec2(0);

        assertAll(
                () -> assertEquals(0, fib1),
                () -> assertEquals(0, fib2)
        );
    }

    @Test
    void test_giveFibonacciNumber2_shouldReturn1() {

        int fib1 = FibonacciDemo.fiboRec1(2);
        int fib2 = FibonacciDemo.fiboRec2(2);

        assertAll(
                () -> assertEquals(1, fib1),
                () -> assertEquals(1, fib2)

        );
    }

    @Test
    void test_giveFibonacciNumberLowerThan0_shouldThrowException() {

        assertAll(
                () -> assertThrows(StackOverflowError.class, () -> {
                    FibonacciDemo.fiboRec1(-1);
                }),
                () -> assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    FibonacciDemo.fiboRec2(-1);
                })
        );
    }
}