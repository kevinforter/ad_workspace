package ch.hslu.informatik.ad.datenstrukturen.D3.E3.Geeks4Geeks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashtabelleDemoG4G {

    private static final Logger LOG = LoggerFactory.getLogger(HashtabelleG4G.class);


    public static void main (String[] args) {

        HashtabelleG4G hashtable = new HashtabelleImplG4G(10);

        hashtable.insert(1, "Element 1");
        hashtable.insert(2, "Element 2");
        hashtable.insert(3, "Element 3");
        hashtable.insert(4, "Element 4");
        hashtable.insert(5, "Element 5");
        hashtable.insert(6, "Element 6");
        hashtable.insert(7, "Element 7");
        hashtable.insert(8, "Element 8");
        hashtable.insert(9, "Element 9");
        hashtable.insert(10, "Element 10");

        LOG.info("SIZE:\t\t\t\t\t" + hashtable.getSize());
        LOG.info("HASHTABELLE:\t\t\t" + hashtable);
        LOG.info("TABELLE VOLL?:\t\t" + hashtable.isFull() + "\n");

        LOG.info("ELEMENT MIT KEY 2:\t" + hashtable.search(2));
        hashtable.remove(2);
        LOG.info("ELEMENT MIT KEY 2:\t" +hashtable.search(2) + "\n");

        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("TABELLE VOLL?:\t\t" + hashtable.isFull());
    }
}
