package ch.hslu.informatik.ad.datenstrukturen.D3.E4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HashTableBucketDemo {

    private static final Logger LOG = LoggerFactory.getLogger(HashTableBucketDemo.class);


    public static void main (String[] args) {

        HashTableBucket hashtable = new HashTableBucketImpl(10);

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

        LOG.info("SIZE: " + hashtable.size());
        LOG.info("HASHTABELLE:" + hashtable + "\n");

        hashtable.insert(10, "Element 10");
        LOG.info("SIZE: " + hashtable.size());
        LOG.info("HASHTABELLE:" + hashtable + "\n");

        LOG.info("ELEMENT MIT KEY 2: " + hashtable.search(2));
        hashtable.remove(2);
        LOG.info("ELEMENT MIT KEY 2: " + hashtable.search(2) + "\n");

        LOG.info("SIZE: " + hashtable.size());
        LOG.info("HASHTABELLE:" + hashtable + "\n");

        hashtable.insert(2, "Element 2");
        LOG.info("SIZE: " + hashtable.size());
        LOG.info("HASHTABELLE:" + hashtable + "\n");

        LOG.info("ELEMENT MIT KEY 10: " + hashtable.search(10));
        hashtable.remove(10);
        LOG.info("ELEMENT MIT KEY 10: " + hashtable.search(10) + "\n");
        LOG.info("SIZE: " + hashtable.size());
        LOG.info("HASHTABELLE:" + hashtable);
    }
}
