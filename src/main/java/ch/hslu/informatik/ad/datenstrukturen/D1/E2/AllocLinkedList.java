package ch.hslu.informatik.ad.datenstrukturen.D1.E2;

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

    public void insertAtHead(Allocation... valueList) {
        for (Allocation value: valueList) {
            insertAtHead(value);
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
            // Zuweisung des neuen Nodes
            node.setNext(n.getNext());
            // Next des vorherigen Nodes auf den neuen Node
            n.setNext(node);
        }
    }

    public void remove(Allocation value) {
        if (head.getValue().equals(value)) {
            removeHead();
        } else {
            Node node = head;
            Node nToDelete;

            // Iteration durch Liste
            while (node.getNext() != null) {
                if (node.getNext().getValue().equals(value)) {
                    // Wenn der nächste Node der zu Löschende ist
                    nToDelete = node.getNext();
                    // Node aus der liste entfernen
                    node.setNext(nToDelete.getNext());
                    // Java Garbage Collector übergeben
                    nToDelete = null;
                    size--;
                } else {
                    node = node.getNext();
                }
            }
        }
    }


    public void removeHead() {
        if (isEmpty()) {
            throw new IllegalStateException("List ist empty");
        } else {
            head = head.getNext();
            size--;
        }
    }

    public Allocation popHead() {
        Node oldHead = head;
        removeHead();
        return oldHead.getValue();
    }

    public void removeAtIndex(int index) {

        if (index == 0) {
            head = head.getNext();
            size--;
        } else {
            Node n = head;
            Node nToDelete;
            for (int i = 0; i < index - 1; i++) {
                // Nodes nach vorne gehen bis Index matcht
                n = n.getNext();
            }
            // Falls nächster Node der zu Löschende ist
            nToDelete = n.getNext();
            // Node aus Liste löschen
            n.setNext(nToDelete.getNext());
            // Node an Java Garbage Collector übergeben
            nToDelete = null;
            size--;
        }
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean contains(Allocation value) {
        Node node = head;

        boolean found = false;
        while (node != null) {

            if (node.getValue().equals(value)) {
                found = true;
                break;
            }
            node = node.getNext();
        }
        return found;
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
