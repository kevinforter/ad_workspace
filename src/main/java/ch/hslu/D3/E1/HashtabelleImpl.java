package ch.hslu.D3.E1;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.util.Objects.hash;

public class HashtabelleImpl implements Hashtabelle {

    private final Integer[] arr;

    public HashtabelleImpl() {
        this.arr = new Integer[10];
    }


    @Override
    public void insert(int key, Integer value) {
        final int index = abs(hash(key) % arr.length);
        arr[index] = value;
    }

    @Override
    public String search(int key) {
        final int index = abs(hash(key) % arr.length);
        return arr[index] != null ? arr[index].toString() : null;
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashtabelleImpl that)) return false;
        return Arrays.equals(arr, that.arr);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arr);
    }

    @Override
    public String toString() {
        return "HashtabelleImpl{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
