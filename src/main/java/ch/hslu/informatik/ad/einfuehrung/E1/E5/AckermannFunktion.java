package ch.hslu.informatik.ad.einfuehrung.E1.E5;

public class AckermannFunktion {

    public static void main (String[] args) {
        long i = ack(4, 4);
        System.out.println(i);
    }

    public static long ack(long m, long n) {

        if (m == 0) return n += 1;

        if (m > 0 && n == 0) return ack(m -1, 1);

        return ack(m - 1, ack(m, n - 1));
    }
}
