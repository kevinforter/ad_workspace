package ch.hslu.D3.E1;

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
