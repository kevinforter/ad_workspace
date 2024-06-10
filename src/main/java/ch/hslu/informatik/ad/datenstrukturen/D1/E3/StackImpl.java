package ch.hslu.informatik.ad.datenstrukturen.D1.E3;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class StackImpl<T> implements Stack<T> {

    private int size = 0;
    private int top = 0;
    private Object[] storage;

    public StackImpl(int capacity) {
        this.storage = new Object[capacity];
    }

    @Override
    public void pop() {
        if (top == 0) {
            throw new EmptyStackException();
        } else {
            top--;
            storage[top] = null;
            size--;
        }
    }

    @Override
    public void push(T obj) {
        if (top == storage.length) {
            throw new StackOverflowError("Stack is already full");
        } else {
            storage[top] = obj;
            top++;
            size++;
        }
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

    @Override
    public void clean() {
        Arrays.fill(storage, null);
        size = 0;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof StackImpl<?> stack)) return false;
        return size == stack.size && top == stack.top && Arrays.equals(storage, stack.storage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, top);
        result = 31 * result + Arrays.hashCode(storage);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(storage);
    }
}
