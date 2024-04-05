package ch.hslu.D3.E2;

import java.util.logging.Logger;

public class PerformanceCompareDemo {

    public static final Logger LOG = Logger.getLogger(PerformanceCompare.class.getName());

    public static void main(String[] args) {

        int anzObject = 100000000;
        long totalArray = 0;
        long totalStack = 0;
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

        long averageTimeArray = totalArray / iterations;
        long averageTimeStack = totalStack / iterations;

        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe: " + averageTimeArray);
        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe: " + averageTimeStack);
    }
}
