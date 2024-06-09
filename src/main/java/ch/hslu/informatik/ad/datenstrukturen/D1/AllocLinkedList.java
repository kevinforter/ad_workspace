package ch.hslu.informatik.ad.datenstrukturen.D1;

public class AllocLinkedList {

    private Node head = null;
    private int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void insert(Allocation value) {

        Node node = new Node(value);
        if (head == null) {
            head = node;
            size++;
        } else {
            Node n = head;
            while (n.getNext() != null) {
                // Solange next Node nicht null gehe eines nach vorne
                n = n.getNext();
            }
            n.setNext(node);
            size++;
        }
    }

    public void insertAtHead(Allocation value) {
        Node node = new Node(value);

        // Next Node des neuen Nodes ist der Head
        node.setNext(head);
        // Neuen Node als Head setzen
        head = node;
        size++;
    }

    public void insertAtIndex(int index, Allocation value) {

        if (index == 0) {
            insertAtHead(value);
        } else {
            Node node = new Node(value);

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                // Nodes nach vorne gehen bis Index matcht
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }


    public void removeHead(Allocation value) {
        if (isEmpty()) {
            throw new IllegalStateException("List ist empty");
        } else {
            head = head.getNext();
        }
    }

    public void removeAtIndex(int index, Allocation value) {

        if (index == 0) {
            removeHead(value);
        } else {
            Node n = head;
            Node nToDelete;
            for (int i = 0; i < index - 1; i++) {
                // Nodes nach vorne gehen bis Index matcht
                n = n.getNext();
            }
            nToDelete = n.getNext();
            n.setNext(nToDelete.getNext());
            nToDelete = null;
        }

    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void show() {
        Node node = head;

        while (node.getNext() != null) {
            System.out.print(node.getValue() + " -> ");
            node = node.getNext();
        }
        System.out.print(node.getValue());
    }
}
