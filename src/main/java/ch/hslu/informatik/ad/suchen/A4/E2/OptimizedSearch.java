package ch.hslu.informatik.ad.suchen.A4.E2;

public class OptimizedSearch {

    public static void main(String[] args) {

        int index = stateSearch("BNMANANASZUW");
        System.out.println("ANANAS wurde beim Index gefunden: " + index);
    }

    /**
     * Durchsucht eine Zeichenkette mittels optimiertem Suchautomaten.
     *
     * @param a Zeichenkette, die nach dem Pattern "ANANAS" durchsucht wird.
     * @return Index der Fundstelle oder -1, falls Pattern in a nicht gefunden wurde.
     */
    public static int stateSearch(final String a) {
        int i = 0; // index to string a
        String state = "-1"; // means "nothing found"
        final int notFound = -1;
        do {
            switch (state) {
                case "-1": // Z0
                    if (a.charAt(i) == 'A') {
                        state = "A";
                    }
                    break;
                case "A": // Z1
                    if (a.charAt(i) == 'N') {
                        state = "AN";
                    }
                    break;
                case "AN": // Z2
                    if (a.charAt(i) == 'A') {
                        state = "ANA";
                    } else {
                        state = "-1";
                    }
                    break;
                case "ANA": // Z3
                    if (a.charAt(i) == 'N') {
                        state = "ANAN";
                    } else {
                        state = "A";
                    }
                    break;
                case "ANAN": // Z4
                    if (a.charAt(i) == 'A') {
                        state = "ANANA";
                    } else {
                        state = "AN";
                    }
                    break;
                case "ANANA": // Z5
                    if (a.charAt(i) == 'S') {
                        state = "ANANAS";
                    } else {
                        state = "ANAN";
                    }
                    break;
            }
            i++;
        } while ((!state.equals("ANANAS") && (i < a.length()))); // Z6
        if (state.equals("ANANAS")) {
            return (i - "ANANAS".length());
        }
        return notFound;
    }
}
