package ch.hslu.D2.E5;

public class Util {

    private Util() {

    }

    static BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTreeImpl();

        bt.insert(5);
        bt.insert(3);
        bt.insert(7);
        bt.insert(2);
        bt.insert(4);
        bt.insert(6);
        bt.insert(8);
        bt.insert(9);
        bt.insert(10);

        return bt;
    }
}
