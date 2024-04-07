package ch.hslu.D3.E1;

import ch.hslu.informatik.ad.datenstrukturen.D3.E1.Hashtabelle;
import ch.hslu.informatik.ad.datenstrukturen.D3.E1.HashtabelleImpl;

public class Util {

    public static Hashtabelle createHashTabelle() {

        return new HashtabelleImpl();
    }

    public static Hashtabelle filledHashTabelle() {

        Hashtabelle hashtabelle = createHashTabelle();

        hashtabelle.insert(1, "Element 1");
        hashtabelle.insert(2, "Element 2");
        hashtabelle.insert(3, "Element 3");

        return hashtabelle;
    }
}
