package ch.hslu.informatik.ad.suchen.A4.E5;

import java.util.Arrays;

public class OptimalMissMatch {

    public static int optimalMissMatch(final String a, final String p) {
        int n = a.length();
        int m = p.length();

        // 1. Initialisierung von pPrime mit den Indizes der Zeichen im Pattern
        int[] pPrime = new int[m];
        for (int i = 0; i < m; i++) {
            pPrime[i] = i;
        }

        // 2. Skip-Tabelle erstellen (Bad Character Heuristik)
        int[] skip = new int[256];
        for (int i = 0; i < 256; i++) {
            skip[i] = m + 1; // Initialisierung mit m + 1 (nicht m)
        }
        for (int i = 0; i < m; i++) { // Schleife geht bis m (nicht m - 1)
            skip[p.charAt(i)] = m - i; // Berechnung des Shifts
        }

        // 3. Suche durchführen
        int i = 0;
        while (i <= n - m) {
            int j = m - 1;
            while (j >= 0 && a.charAt(i + j) == p.charAt(pPrime[j])) {
                j--;
            }
            if (j == -1) {
                return i; // Pattern gefunden
            }

            // 4. pPrime aktualisieren
            if (j > 0) {
                // Das zuletzt geprüfte Zeichen im Pattern (an Position pPrime[j]) wird um eine Position nach vorne verschoben
                int temp = pPrime[j];
                pPrime[j] = pPrime[j - 1];
                pPrime[j - 1] = temp;
            }

            // 5. Shift mit der Skip-Tabelle durchführen
            i += skip[a.charAt(i + m)]; // i + m, da wir das Zeichen nach dem Pattern betrachten
        }
        return -1; // Pattern nicht gefunden
    }
}
