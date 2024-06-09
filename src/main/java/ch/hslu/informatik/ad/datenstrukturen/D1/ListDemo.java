package ch.hslu.informatik.ad.datenstrukturen.D1;

public class ListDemo {

    public static void main(String[] args) {

        final Memory memory = new MemorySimple(1024);
        final Allocation block1 = memory.malloc(16);
        final Allocation block2 = memory.malloc(32);
        final Allocation block3 = memory.malloc(64);
        final Allocation block4 = memory.malloc(128);
        final Allocation block5 = memory.malloc(24);

        AllocLinkedList list = new AllocLinkedList();
        list.insert(block1);
        list.insert(block2);
        list.insert(block3);

        list.show();

        list.insertAtHead(block4);

        System.out.println("\n");
        list.show();
        System.out.println("\nSize: " + list.getSize());

        list.insertAtIndex(1, block5);
        System.out.println("\n");
        list.show();

        list.removeAtIndex(1);
        System.out.println("\n");
        list.show();

        System.out.println("\nFound " + block4 + ": " + list.contains(block4));
    }
}
