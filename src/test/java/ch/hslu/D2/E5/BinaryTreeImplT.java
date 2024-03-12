package ch.hslu.D2.E5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeImplT {

    @Test
    void insert() {

    }

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = Util.createBinaryTree();

        assertTrue(bt.search(6));
        assertTrue(bt.search(4));
        assertFalse(bt.search(1));
    }

    @Test
    void delete() {
    }

    @Test
    void traverseInOrder() {
    }
}