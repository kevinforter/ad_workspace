package ch.hslu.informatik.ad.datenstrukturen.D2.E6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryHashTreeDemo {

    private static final Logger LOG = LoggerFactory.getLogger(BinaryHashTreeDemo.class);

    public static void main(String[] args) {

        BinaryHashTree bt = new BinaryHashTreeImpl();

        bt.insert(5);
        bt.insert(3);
        bt.insert(7);
        bt.insert(2);
        bt.insert(4);
        bt.insert(6);
        bt.insert(8);
        bt.insert(9);
        bt.insert(10);
        LOG.info("");
        LOG.info("SUCHE VON DATEN: ");
        LOG.info("SUCHE NACH: {} -> {}",10, bt.search(10));
        LOG.info("");
        LOG.info("InOrder Traversierung: ");
        bt.traverseInOrder();
    }

}
