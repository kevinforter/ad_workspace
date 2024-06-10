package ch.hslu.informatik.ad.datenstrukturen.D1.E4;

public interface Queue {

    void offer(char element);
    void poll();
    int size();
    boolean isEmpty();

    boolean isFull();
}
