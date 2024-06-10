package ch.hslu.informatik.ad.datenstrukturen.D1.E3;

public interface Stack<T> {

    void pop();
    void push(T obj);
    T peek();
    boolean isEmpty();
    int size();
    void clean();
}
