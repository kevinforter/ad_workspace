package ch.hslu.D3.E3;

public class HashtabelleKollisionSondierungDemo {

    public static void main(String[] args) {
        HashtabelleKollisionSondierung hashtable = new HashtabelleKollisionSondierungImpl();
        hashtable.insert(1, "Element 1");
        hashtable.insert(2, "Element 2");
        hashtable.insert(3, "Element 3");

        System.out.println(hashtable);
        System.out.println(hashtable.search(2));

        hashtable.remove(2);
        System.out.println(hashtable.search(2));

        System.out.println(hashtable);
    }
}