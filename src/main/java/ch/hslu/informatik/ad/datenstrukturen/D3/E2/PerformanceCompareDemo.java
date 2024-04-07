package ch.hslu.informatik.ad.datenstrukturen.D3.E2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceCompareDemo {

    public static final Logger LOG = LoggerFactory.getLogger(PerformanceCompare.class);

    public static void main(String[] args) {

        int anzObject = 10000000;
        long totalArray = 0;
        long totalStack = 0;
        long totalDeque = 0;
        int iterations = 10;
        String[] arr = new String[anzObject];

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

             arr = PerformanceCompare.returnArray(anzObject);

            long end = System.nanoTime();
            totalArray += end - start;
        }

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

            PerformanceCompare.addToStack(arr);

            long end = System.nanoTime();
            totalStack += end - start;
        }

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

            PerformanceCompare.addToDeque(arr);

            long end = System.nanoTime();
            totalDeque += end - start;
        }

        long averageTimeArray = totalArray / iterations;
        long averageTimeStack = totalStack / iterations;
        long averageTimeDeque = totalDeque / iterations;

        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe: " + averageTimeArray);
        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe: " + averageTimeStack);
        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe: " + averageTimeDeque);
    }
}
