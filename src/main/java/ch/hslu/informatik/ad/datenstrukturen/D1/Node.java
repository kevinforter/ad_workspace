package ch.hslu.informatik.ad.datenstrukturen.D1;

public class Node<Allocation> {

    Allocation value;

    Node<Allocation> next;

    public Node(Allocation value) {
        this.value = value;
    }

    public Node<Allocation> getNext() {
        return this.next;
    }

    public Allocation getValue() {
        return this.value;
    }

    public void setNext(Node<Allocation> next) {
        this.next = next;
    }
}
