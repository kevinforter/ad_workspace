package ch.hslu.informatik.ad.sortierungen.A1.E3;

import org.slf4j.*;

import java.util.Arrays;

public class Sort {

    private static final Logger LOG = LoggerFactory.getLogger(Sort.class);

    public Sort() {
    }

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
}
