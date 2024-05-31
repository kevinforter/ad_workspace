package ch.hslu.informatik.ad.einfuehrung.E1.E4;

public class FibonacciDemo {

    public static void main(String[] args) {
        int i = fiboRec1(9);
        System.out.println(i);
    }

    public static int fiboRec1(int n) {
        int f = 1;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return f;
        }

        f = fiboRec1(n - 2) + fiboRec1(n - 1);
        return f;
    }
}
