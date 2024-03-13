package ch.hslu.D2.E5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryTreeImpl implements BinaryTree {

    private static final Logger LOG = LoggerFactory.getLogger(BinaryTreeImpl.class);

    private Node root;

    public BinaryTreeImpl() {
    }

    @Override
    public void insert(int data) {
        root = insertRecursive(root, data);
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
        LOG.info("Starting search for element: " + data);
        return searchRecursively(root, data);
    }

    private boolean searchRecursively(Node currentNode, int target) {

        // Wenn Baum leer ist, dann false
        if (currentNode == null) {
            LOG.info("Element not found.");
            return false;
        }

        // Wenn data gefunden, dann true
        if (target == currentNode.getData()) {
            LOG.info("Element found: " + currentNode);
            return true;
        }

        // Wenn data kleiner ist als der Wert des aktuellen Knotens, dann gehe nach links
        if (target < currentNode.getData()) {
            LOG.info("Moving to the left child: " + currentNode.getKindLinks());
            return searchRecursively(currentNode.getKindLinks(), target);
            // Wenn data grösser ist als der Wert des aktuellen Knotens, dann gehe nach rechts
        } else {
            LOG.info("Moving to the right child: " + currentNode.getKindRechts());
            return searchRecursively(currentNode.getKindRechts(), target);
        }
    }

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
