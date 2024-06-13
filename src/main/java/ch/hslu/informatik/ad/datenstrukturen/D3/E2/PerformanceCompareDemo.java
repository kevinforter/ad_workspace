package ch.hslu.informatik.ad.datenstrukturen.D3.E2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PerformanceCompareDemo {

    public static final Logger LOG = LoggerFactory.getLogger(PerformanceCompare.class);

    public static void main(String[] args) {

        int anzObject = 10_000_000;
        long totalOwnStack = 0;
        long totalStack = 0;
        long totalDeque = 0;
        int iterations = 10;
        String[] arr = ObjectArray.returnArray(anzObject);

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

            PerformanceCompare.addToStack(arr);

            long end = System.nanoTime();
            totalStack += end - start;
        }

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

            PerformanceCompare.addToOwnStack(arr, anzObject);

            long end = System.nanoTime();
            totalOwnStack += end - start;
        }

        for (int i = 0; i < iterations; i++) {
            long start = System.nanoTime();

            PerformanceCompare.addToDeque(arr);

            long end = System.nanoTime();
            totalDeque += end - start;
        }

        double averageTimeArray = ((double) totalOwnStack / iterations) / 1E9;
        double averageTimeStack = ((double) totalStack / iterations) / 1E9;
        double averageTimeDeque = ((double) totalDeque / iterations) / 1E9;

        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe (Own Stack): \t" + averageTimeArray + " sek.");
        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe (Coll Stack): \t" + averageTimeStack + " sek.");
        LOG.info("Durchschnittliche Messzeit für " + iterations + " Durchläufe (Deque): \t\t" + averageTimeDeque + " sek.");
    }
}
