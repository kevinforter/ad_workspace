package ch.hslu.informatik.ad.datenstrukturen.D1.E4;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new QueueImpl<>(8);
        System.out.println(queue);

        queue.offer("🚀");
        System.out.println(queue);

        queue.offer("🎸");
        queue.offer("🇺🇸");
        queue.offer("🏎️");
        queue.offer("✈️");
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.offer("☀️");
        System.out.println(queue);

        queue.offer("🦊");
        System.out.println(queue);
        queue.offer("🪖");
        System.out.println(queue);
        queue.offer("💣");
        System.out.println(queue);

        queue.clean();
        System.out.println(queue);
    }
}
