package ch.hslu.informatik.ad.datenstrukturen.D3.E3.PHPfog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashtabellePHPfogDemo {

    private static final Logger LOG = LoggerFactory.getLogger(HashtabellePHPfogDemo.class);

    public static void main(String[] args) {

        HashtabellePHPfog hashtable = new HashtabellePHPfogImpl();

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
        LOG.info("TABELLE VOLL?:\t\t\t" + hashtable.isFull() + "\n");

        hashtable.insert(10, "Element 10");
        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("ELEMENT MIT KEY 2:\t\t" + hashtable.search(2));
        hashtable.remove(2);
        LOG.info("ELEMENT MIT KEY 2:\t\t" +hashtable.search(2) + "\n");

        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("TABELLE VOLL?:\t\t\t" + hashtable.isFull());
    }
}
