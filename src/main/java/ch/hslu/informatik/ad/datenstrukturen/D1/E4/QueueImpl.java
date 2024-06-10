package ch.hslu.informatik.ad.datenstrukturen.D1.E4;

import java.util.Arrays;

public class QueueImpl implements Queue {

    private final char[] queue = new char[8];
    private int size;
    private int tail = 0;
    private int head;

    @Override
    public void offer(char element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        } else {
            queue[tail] = element;
            tail = (tail + 1) % 8;
            size++;
        }
    }

    @Override
    public void poll() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            queue[head] = 0;
            head = (head + 1) % 8;
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isFull() {
        return size() == 8;

    }

    @Override
    public String toString() {
        return "QueueImpl{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + size +
                ", tail=" + tail +
                ", head=" + head +
                '}';
    }
}
