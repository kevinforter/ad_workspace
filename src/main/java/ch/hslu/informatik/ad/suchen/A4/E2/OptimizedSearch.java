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
        String state = "NAN"; // means "nothing found"
        final int notFound = -1;
        do {
            switch (state) {
                case "NAN":
                    if (a.charAt(i) == 'A') {
                        state = "A";
                    }
                    break;
                case "A":
                    if (a.charAt(i) == 'N') {
                        state = "AN";
                    }
                    break;
                case "AN":
                    if (a.charAt(i) == 'A') {
                        state = "ANA";
                    }
                    break;
                case "ANA":
                    if (a.charAt(i) == 'N') {
                        state = "ANAN";
                    }
                    break;
                case "ANAN":
                    if (a.charAt(i) == 'A') {
                        state = "ANANA";
                    }
                    break;
                case "ANANA":
                    if (a.charAt(i) == 'S') {
                        state = "ANANAS";
                    } else {
                        state = "ANAN";
                    }
                    break;
            }
            i++;
        } while ((!state.equals("ANANAS") && (i < a.length())));
        if (state.equals("ANANAS")) {
            return (i - "ANANAS".length());
        }
        return notFound;
    }
}
