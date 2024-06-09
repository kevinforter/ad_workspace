package ch.hslu.informatik.ad.datenstrukturen.D1;

public class Node {

    private Allocation value;

    private Node next;

    public Node() {
    }

    public Node(Allocation value) {
        this.value = value;
        this.next = null;
    }

    public Allocation getValue() {
        return value;
    }

    public void setValue(Allocation value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
