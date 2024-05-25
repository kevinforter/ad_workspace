package ch.hslu.informatik.ad.sortierungen.A2.E2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Sort {

    private static final Logger LOG = LoggerFactory.getLogger(Sort.class);

    /**
     * Sortiert das int-Array aufsteigend
     *
     * @param   a Zu sortierendes Array.
     * @return  sortiertes Array
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
     * Sortiert das int-Array aufsteigend mit Binär-Suche
     *
     * @param   a Zu sortierendes Array.
     * @return  sortiertes Array
     * @link <a href="https://www.geeksforgeeks.org/java-program-for-binary-insertion-sort/">Binary Insertion sort</a>
     */
    public static int[] insertionSort3(final int[] a) {
        for (int i = 1; i < a.length; i++) {
            int elt = a[i];

            // Ort zum Einfügen mit BinarySearch suchen
            int j = Math.abs(Arrays.binarySearch(a, 0, i, elt) + 1);

            // Nach rechts verschieben mit copyarray
            System.arraycopy(a, j, a, j + 1, i - j);

            // Element in Array einfügen
            a[j] = elt;
        }
        return a;
    }

    /**
     * Sortiert das int-Array aufsteigend
     *
     * @param   a Zu sortierendes Array.
     * @return  sortiertes Array
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

    /**
     * Sortiert das int-Array aufsteigend
     *
     * @param   a Zu sortierendes Array.
     * @return  sortiertes Array
     * @link <a href="https://www.geeksforgeeks.org/java-program-for-bubble-sort/">Bubble Sort</a>
     */
    public static int[] bubbleSort(final int[] a) {
        // Anzahl Elemente im Array abarbeiten (-1 weil Anz Vergleiche eins weniger als Elemente ist)
        for (int i = 0; i < a.length - 1; i++) {

            // Start immer beim ersten Element (j = 0)
            // -i weil rechter Teil immer sortiert ist
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {

                    // Tausch von a[j] und a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    /**
     * Sortiert das int-Array aufsteigend
     *
     * @param   a Zu sortierendes Array.
     * @return  sortiertes Array
     * @link <a href="https://www.geeksforgeeks.org/bubble-sort/">Bubble Sort with check</a>
     */
    public static int[] bubbleSort2(final int[] a) {
        // Anzahl Elemente im Array abarbeiten (-1 weil Anz Vergleiche eins weniger als Elemente ist)
        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            // Start immer beim ersten Element (j = 0)
            // -i weil rechter Teil immer sortiert ist
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {

                    // Tausch von a[j] und a[j+1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            // Wenn nichts getauscht raus aus loop
            if (!swapped) break;
        }
        return a;
    }

    /**
     * Vertauscht zwei bestimmte Zeichen im Array.
     *
     * @param a           Zeichen-Array
     * @param firstIndex  Index des ersten Zeichens
     * @param secondIndex Index des zweiten Zeichens
     */
    private static void exchange(final char[] a, final int firstIndex, final int secondIndex) {
        char tmp;
        tmp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = tmp;
    }

    public static void quickSort(final char[] a, final int left, final int right) {
    int up = left; // linke Grenze
    int down = right - 1; // rechte Grenze (ohne Trennelement)
    char t = a[right]; // rechtes Element als Trennelement
    boolean allChecked = false;
    do {
        while (a[up] < t) {
            up++; // suche grösseres (>=) Element von links an
        }
        while ((a[down] > t) && (down > up)) { // geänderte Bedingung
            down--; // suche echt kleineres (<) Element von rechts an
        }
        if (down > up) { // solange keine Überschneidung
            exchange(a, up, down);
            up++;
            down--; // linke und rechte Grenze verschieben
        } else {
            allChecked = true; // Austauschen beendet
        }
    } while (!allChecked);
    exchange(a, up, right); // Trennelement an endgültige Position (a[up])
    if (left < (up - 1)) quickSort(a, left, (up - 1)); // linke Hälfte
    if ((up + 1) < right) quickSort(a, (up + 1), right); // rechte Hälfte, ohne T’Elt.
}

    public static void quickSort(final char[] a) {
        int left = 0;
        int right = a.length - 1;

        quickSort(a, left, right);
    }
}
