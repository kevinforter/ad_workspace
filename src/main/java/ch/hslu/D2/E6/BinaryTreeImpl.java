package ch.hslu.D2.E6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryTreeImpl implements BinaryTree {

    private static final Logger LOG = LoggerFactory.getLogger(BinaryTreeImpl.class);

    private Node root;

    public BinaryTreeImpl() {
    }

    @Override
    public void insert(int data) {
        int hash = Integer.hashCode(data);
        if (!search(hash)) {
            root = insertRecursive(root, data);
        } else {
            LOG.info("Element mit dem gleichen Hashwert existiert schon.");
        }
    }

    private Node insertRecursive(Node current, int data) {

        // Wenn Baum leer ist, dann neuer Knoten
        if (current == null) {
            return new Node(data);
        }

        // Wenn data kleiner ist als der Wert des aktuellen Knotens, dann gehe nach links
        if (data < current.getData()) {
            current.setKindLinks(insertRecursive(current.getKindLinks(), data));

            // Wenn data grösser ist als der Wert des aktuellen Knotens, dann gehe nach rechts
        } else if (data > current.getData()) {
            current.setKindRechts(insertRecursive(current.getKindRechts(), data));
        } else {

            // Wert existiert bereits
            return current;
        }

        return current;
    }

    @Override
    public boolean search(int data) {
        LOG.info("Start der Suche nach: " + data);
        return searchRecursively(root, data);
    }

    private boolean searchRecursively(Node currentNode, int target) {

        // Wenn Baum leer ist, dann false
        if (currentNode == null) {
            LOG.info("Knoten nicht gefunden.");
            return false;
        }

        // Wenn data gefunden, dann true
        if (target == currentNode.getData()) {
            LOG.info("Knoten gefunden: " + currentNode);
            return true;
        }

        // Wenn data kleiner ist als der Wert des aktuellen Knotens, dann gehe nach links
        if (target < currentNode.getData()) {
            LOG.info("Wechsel zum linken Kind: " + currentNode.getKindLinks());
            return searchRecursively(currentNode.getKindLinks(), target);
            // Wenn data grösser ist als der Wert des aktuellen Knotens, dann gehe nach rechts
        } else {
            LOG.info("Wechsel zum rechten Kind: " + currentNode.getKindRechts());
            return searchRecursively(currentNode.getKindRechts(), target);
        }
    }

    /*
    @Override
    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(Node current, int data) {

        // Wenn Baum leer ist, dann false
        if (current == null) {
            return false;
        }

        // Wenn data gefunden, dann true
        if (data == current.getData()) {
            return true;
        }

        // Wenn data kleiner ist als der Wert des aktuellen Knotens, dann gehe nach links
        return data < current.getData()
                ? searchRecursive(current.getKindLinks(), data)
                : searchRecursive(current.getKindRechts(), data);
    }

     */

    @Override
    public void delete(int data) {

    }

    @Override
    public void traverseInOrder() {
        inOrderRecursive(root);
        LOG.info("FINISH"); // newline wenn fertig
    }

    private void inOrderRecursive(Node current) {
        if (current != null) {
            inOrderRecursive(current.getKindLinks());
            LOG.info(current.getData() + " ");
            inOrderRecursive(current.getKindRechts());
        }
    }
}
