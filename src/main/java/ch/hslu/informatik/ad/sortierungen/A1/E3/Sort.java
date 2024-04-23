package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.slf4j.*;

import java.util.Arrays;

public class Sort {

    private static final Logger LOG = LoggerFactory.getLogger(Sort.class);

    public static int[] insertionSort2(final int[] a) {
        int elt;
        int j;
        for (int i = 1; i < a.length; i++) {
            elt = a[i];                         // next elt for insert
            //a[0] = elt;                       // dummy-element (for what)
            j = i;                              // a[1]..a[j-1] already sorted
            while (j > 0 && a[j - 1] > elt) {   // solange vorheriges Element grösser ist
                a[j] = a[j - 1];                // shift right
                j--;                            // go further left
            }
            a[j] = elt;                         // insert elt
        }
        return a;                               // a[1]...a[j] sorted
    }

    public static int[] insertionSort3(final int[] a) {
        for (int i = 1; i < a.length; i++) {
            int elt = a[i];
            int insertLocation = Arrays.binarySearch(a, 0, i, elt);
            if (insertLocation < 0) {
                insertLocation = -(insertLocation + 1);
            }
            System.arraycopy(a, insertLocation, a, insertLocation + 1, i - insertLocation);
            a[insertLocation] = elt;
        }
        return a;
    }

    public static void selectionSort(final int[] a) {
        int elt;
        int currentSmallestNumber;
        int currentSmallestNumberIndex = 0;

        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            elt = a[i];
            currentSmallestNumber = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < currentSmallestNumber) {
                    currentSmallestNumber = a[j];
                    currentSmallestNumberIndex = j;
                }
                if (j == a.length-1) {
                    a[currentSmallestNumberIndex] = elt;
                }
            }
            a[i] = currentSmallestNumber;
        }
        long end = System.nanoTime();
        long sum = end - start;
        LOG.info("Gesamte Zeit: " + sum);
        LOG.info(Arrays.toString(a));
    }
}
