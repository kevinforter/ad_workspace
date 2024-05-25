package ch.hslu.informatik.ad.datenstrukturen.D3.E3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class HashtabelleKollisionSondierungDemo {

    public static final Logger LOG = LoggerFactory.getLogger(HashtabelleKollisionSondierungDemo.class);

    public static void main(String[] args) {
        HashtabelleKollisionSondierung hashtable = getHashtabelleKollisionSondierung();

        LOG.info("SIZE:\t\t\t\t\t" + hashtable.size());
        LOG.info("HASHTABELLE:\t\t\t" + hashtable);
        LOG.info("TABELLE VOLL?:\t\t\t" + hashtable.isFull() + "\n");

        hashtable.insert(10, "Element 10");
        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("ELEMENT MIT KEY 2:\t\t" + hashtable.search(2));
        LOG.info("LÖSCHEN VON KEY 2:\t\t" + hashtable.remove(2));
        LOG.info("ELEMENT MIT KEY 2:\t\t" +hashtable.search(2) + "\n");

        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("TABELLE VOLL?:\t\t\t" + hashtable.isFull());
    }

    private static HashtabelleKollisionSondierung getHashtabelleKollisionSondierung() {
        HashtabelleKollisionSondierung hashtable = new HashtabelleKollisionSondierungImpl();
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
        return hashtable;
    }
}