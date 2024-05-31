package ch.hslu.informatik.ad.einfuehrung.E1.E4;

public class FibonacciDemo {

    static int[] f = new int[Integer.MAX_VALUE];

    public static void main(String[] args) {
        int fib1 = fiboRec1(9);
        System.out.println(fib1);

        int fib2 = fiboRec2(9);
        System.out.println(fib2);
    }

    public static int fiboRec1(int n) {
        int f = 1;

        // Rekursionsbasis
        if (n == 0) {
            return 0;
        }

        // Rekursionsbasis
        if (n == 1) {
            return f;
        }

        // Rekursionsvorschrift
        f = fiboRec1(n - 2) + fiboRec1(n - 1);
        return f;
    }

    public static int fiboRec2(int n) {

        if(n == 0 || n == 1) {
            return n;
        }

        if(f[n] != 0) {
            return f[n];
        }

        f[n] = fiboRec1(n - 2) + fiboRec1(n - 1);
        return f[n];

    }
}
