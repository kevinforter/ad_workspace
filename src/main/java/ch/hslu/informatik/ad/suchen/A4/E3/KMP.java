package ch.hslu.informatik.ad.suchen.A4.E3;

import java.util.Arrays;

public class KMP {

    /**
     * Erzeugt für das Pattern einen Musterautomaten.
     *
     * @param p Pattern, nach dem später gesucht werden soll.
     * @return Musterautomat in Form eines int-Arrays.
     */
    private static int[] initNext(final String p) {
        final int m = p.length();
        final int[] next = new int[m];
        int i = 0;
        int j = -1;
        next[0] = -1;
        // special value! (-1 = no reference to a following state)
        do {
            if ((j == -1) || (p.charAt(i) == p.charAt(j))) {
                // (j == -1) must be first operand!
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        } while (i < (m - 1));
        //System.out.println(Arrays.toString(next)); // prints out the next array
        return next;
    }

    public static int kmpSearch(final String a, final String p) {
        final int n = a.length();
        final int m = p.length();
        int i = 0; // index to string a
        int j = 0; // index to pattern p respectively state

        // 1. generate next
        int[] next = initNext(p);
        // 2. search for p
        do {
            if ((j == -1) || (a.charAt(i) == p.charAt(j))) { // (j == -1) first!
                i++; // process next character
                j++;
            } else {
                j = next[j]; // go to next state
            }
            //System.out.print("State: " + j + " -> "); // print the current state
        } while ((j < m) && (i < n));
        if (j == m) {
            return (i - m); // pattern found: index to position in a
        } else {
            return -1; // pattern not found
        }
    }
}
