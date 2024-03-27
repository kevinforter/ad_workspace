package ch.hslu.D3.E1;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.util.Objects.hash;

public class HashtabelleImpl implements Hashtabelle {


    private final String[] arr;
    private static final int TABLE_SIZE = 10;
    private HashtabelleImpl() {
        this.arr = new String[TABLE_SIZE];
    }


    @Override
    public void insert(Integer key, String value) {
        final int index = abs(hash(key) % arr.length);
        arr[index] = value;
    }

    @Override
    public String search(Integer key) {
        final int index = abs(hash(key) % arr.length);
        return arr[index] != null ? arr[index] : null;
    }

    @Override
    public void remove(Integer key) {
        final int index = abs(hash(key) % arr.length);
        arr[index] = null;
    }

    @Override
    public String toString() {
        return "HashtabelleImpl{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
