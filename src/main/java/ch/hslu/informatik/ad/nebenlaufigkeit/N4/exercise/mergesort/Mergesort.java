package ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.mergesort;

public class Mergesort {

    private static char[] b;

    /**
     * Sortiert ein Zeichen-Array mit dem Mergesort-Algorithmus.
     *
     * @param a Zeichen-Array zum Sortieren
     */
    public static void mergeSort(final char[] a) {
        b = new char[a.length]; // zusätzlicher Speicher fürs Mergen
        mergeSort(a, 0, a.length - 1);
    }

    /**
     * Rekursiver Mergesort-Algorithmus.
     *
     * @param a     Zeichen-Array zum Sortieren
     * @param left  linke Grenze, zu Beginn 0
     * @param right rechte Grenze, zu Beginn a.length - 1
     */

    private static void mergeSort(final char a[], final int left, final int right) {
        int i, j, k, m;
        if (right > left) {
            m = (right + left) / 2; // Mitte ermitteln
            mergeSort(a, left, m); // linke Hälfte sortieren
            mergeSort(a, m + 1, right); // rechte Hälfte sortieren
            // "Mergen"
            for (i = left; i <= m; i++) { // linke Hälfte in Hilfsarray kopieren
                b[i] = a[i];
            }
            for (j = m; j < right; j++) { // rechte Hälfte umgekehrt in Hilfsa. kopieren
                b[right + m - j] = a[j + 1];
            }
            i = left;
            j = right; // Index für linke und rechte Hälfte
            for (k = left; k <= right; k++) { // füge sortiert in a ein
                if (b[i] <= b[j]) {
                    a[k] = b[i];
                    i++;
                } else {
                    a[k] = b[j];
                    j--;
                }
            }
        }
    }
}
