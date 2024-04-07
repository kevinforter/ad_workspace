package ch.hslu.D2.E5;

import ch.hslu.informatik.ad.datenstrukturen.D2.E5.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeImplT {

    private BinaryTree bt;

    @BeforeEach
    public void setUp() {
        bt = Util.createBinaryTree();
    }

    @Test
    void insertElementToTree_WhenAlreadyExist() {

        //assertTrue(bt.insert(5));

    }

    @Test
    public void givenABinaryTree_WhenAddingRoot_ThenTreeContainsRootAlready() {

        assertTrue(bt.search(5));
    }

    @Test
    public void givenABinaryTree_WhenAddingElement_ThenTreeContainsThisElement() {

        assertTrue(bt.search(6));

    }

    @Test
    public void givenABinaryTree_WhenAddingElement_ThenTreeContainsNotThisElement() {

        assertFalse(bt.search(1));

    }

    @Test
    void delete() {
    }

    @Test
    void traverseInOrder() {
    }
}