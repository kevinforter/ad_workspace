package ch.hslu.D3.E1;

public class HashtabelleDemo {

    public static void main(String[] args) {
        Hashtabelle hashtable = new HashtabelleImpl();
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