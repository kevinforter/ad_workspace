package ch.hslu.D3.E3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class HashtabelleKollisionSondierungDemo {

    public static final Logger LOG = LoggerFactory.getLogger(HashtabelleKollisionSondierungDemo.class);

    public static void main(String[] args) {
        HashtabelleKollisionSondierung hashtable = new HashtabelleKollisionSondierungImpl();
        hashtable.insert(1, "Element 1");
        hashtable.insert(2, "Element 2");
        hashtable.insert(3, "Element 3");

        LOG.info("SIZE:\t\t\t\t\t" + hashtable.size());
        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("ELEMENT MIT KEY 2:\t" + hashtable.search(2));
        LOG.info("LÖSCHEN VON KEY 2:\t" + hashtable.remove(2));
        LOG.info("ELEMENT MIT KEY 2:\t" +hashtable.search(2) + "\n");

        LOG.info("HASHTABELLE:\t\t\t" + hashtable + "\n");

        LOG.info("TABELLE VOLL?:\t\t" + hashtable.isFull());
    }
}