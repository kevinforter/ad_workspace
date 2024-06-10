package ch.hslu.informatik.ad.datenstrukturen.D1.E3;

public class StackImpl<T> implements Stack<T> {

    private int SIZE;
    private T[] storage;

    public void StackImpl(int SIZE) {
        this.SIZE = SIZE;
    }

    @Override
    public void pop() {

    }

    @Override
    public void push(T obj) {

    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return SIZE == 0;
    }
}
