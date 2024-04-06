package ch.hslu.D3.E3;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.util.Objects.hash;

public class HashtabelleKollisionSondierungImpl implements HashtabelleKollisionSondierung {


    private final String[] arr;
    private int size;
    private static final int TABLE_SIZE = 10;

    public HashtabelleKollisionSondierungImpl() {
        this.arr = new String[TABLE_SIZE];
        this.size = 0;
    }

    @Override
    public void insert(Integer key, String value) {
        // Komprimierung
        final int index = abs(hash(key) % arr.length);
        if (arr[index] == null) {
            arr[index] = value;
            size++;
        } else if (!arr[index].equals(value)) {
            throw new IllegalArgumentException("Duplicate value not allowed");
        }
    }

    @Override
    public String search(Integer key) {
        final int index = abs(hash(key) % arr.length);
        return arr[index] != null ? arr[index] : null;
    }

    @Override
    public boolean remove(Integer key) {
        final int index = abs(hash(key) % arr.length);
        if (arr[index] != null) {
            arr[index] = null;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size() == TABLE_SIZE;
    }

    @Override
    public String toString() {
        return "HashtabelleImpl{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
