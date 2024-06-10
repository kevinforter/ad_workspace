package ch.hslu.informatik.ad.datenstrukturen.D1.E3;

public class StackImpl<T> implements Stack<T> {

    private int size = 0;
    private int top = 0;
    private Object[] storage;

    public StackImpl(int capacity) {
        this.storage = new Object[capacity];
    }

    @Override
    public void pop() {
        storage[top - 1] = null;
        top--;
        size--;
    }

    @Override
    public void push(T obj) {
        storage[top] = obj;
        top++;
        size++;
    }

    @Override
    public T peek() {
        return (T) storage[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
