package ch.hslu.D3.E2;

import java.util.logging.Logger;

public class PerformanceCompareDemo {

    public static final Logger LOG = Logger.getLogger(PerformanceCompare.class.getName());

    public static void main(String[] args) {

        long total = 0;
        int iterations = 10;

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

            String[] arr = PerformanceCompare.returnArray(100000);

            long end = System.nanoTime();
            total += end - start;
        }

        long averageTime = total / iterations;
        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe: " + averageTime);

    }
}
