package ch.hslu.informatik.ad.datenstrukturen.D1.E2;

public class Node<T> {

    private T value;

    private Node<T> next;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
