package ch.hslu.informatik.ad.datenstrukturen.D1.E4;

public class QueueDemo {

    public static void main(String[] args) {

        Queue queue = new QueueImpl();
        System.out.println(queue);

        queue.offer('a');
        System.out.println(queue);

        queue.offer('b');
        queue.offer('c');
        queue.offer('d');
        queue.offer('e');
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.offer('f');
        System.out.println(queue);

        queue.offer('g');
        System.out.println(queue);
        queue.offer('h');
        System.out.println(queue);
        queue.offer('i');
        System.out.println(queue);

    }
}
