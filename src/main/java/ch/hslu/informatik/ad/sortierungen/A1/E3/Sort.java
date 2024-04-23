package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.slf4j.*;

import java.util.Arrays;

public class Sort {

    private static final Logger LOG = LoggerFactory.getLogger(Sort.class);

    /**
     * Sortiert das int-Array aufsteigend
     *
     * @param a Zu sortierendes Array.
     */
    public static int[] insertionSort2(final int[] a) {
        int elt;
        int j;
        for (int i = 0; i < a.length; i++) {
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

    /**
     * Sortiert das int-Array aufsteigend Binär
     *
     * @param a Zu sortierendes Array.
     */
    public static int[] insertionSort3(final int[] a) {
        for (int i = 0; i < a.length; i++) {
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

    /**
     * Sortiert das int-Array aufsteigend
     *
     * @param a Zu sortierendes Array.
     */
    public static int[] selectionSort(final int[] a) {
        for (int i = 0; i < a.length; i++) {
            int elt = a[i];
            int currentSmallestNumber = i;
            for (int j = i + 1; j < a.length; j++) {
                // Suche nach kleinster Zahl
                if (a[j] < a[currentSmallestNumber]) {
                    currentSmallestNumber = j;
                }
            }
            // Tausch von Nummern
            a[i] = a[currentSmallestNumber];
            a[currentSmallestNumber] = elt;
        }
        return a;
    }
}
