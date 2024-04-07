// Credits: https://phpfog.com/how-to-create-a-hash-table-in-java-chaining-example/
package ch.hslu.informatik.ad.datenstrukturen.D3.E3.PHPfog;

import java.util.Arrays;
import java.util.LinkedList;

public class HashtabellePHPfogImpl implements HashtabellePHPfog {

    private int currentSize;

    // Objekt für HashTabelle
    public class HTObject {
        public Integer key;
        public String value;
    }

    public static final int ARR_SIZE = 10;
    private LinkedList<HTObject>[] arr = new LinkedList[ARR_SIZE];

    // Konstruktor
    public HashtabellePHPfogImpl() {
        //init vals in array
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = null;
        }
    }

    // Suche nach dem Objekt
    private HTObject searchObj(Integer key) {
        if (key == null) return null;

        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if (items == null) return null;

        for (HTObject item : items) {
            if (item.key.equals(key))
                return item;
        }

        return null;
    }

    @Override
    public String search(Integer key) {
        HTObject item = searchObj(key);

        if (item == null) {
            return null;
        } else {
            return item.value;
        }
    }

    @Override
    public void insert(Integer key, String value) {
        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if (items == null) {
            items = new LinkedList<HTObject>();

            HTObject item = new HTObject();
            item.key = key;
            item.value = value;

            items.add(item);

            arr[index] = items;
            currentSize++;
        } else {
            // überschreibung des Schlüssels
            for (HTObject item : items) {
                if (item.key.equals(key)) {
                    item.value = value;
                    return;
                }
            }

            HTObject item = new HTObject();
            item.key = key;
            item.value = value;

            items.add(item);
        }
    }

    @Override
    public void remove(Integer key) {
        int index = key.hashCode() % ARR_SIZE;
        LinkedList<HTObject> items = arr[index];

        if (items == null) return;

        for (HTObject item : items) {
            if (item.key.equals(key)) {
                items.remove(item);
                currentSize--;
            }
        }
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        return currentSize == ARR_SIZE;
    }

    @Override
public String toString() {
    String result = "HashtabellePHPfogImpl{";
    for (int i = 0; i < ARR_SIZE; i++) {
        if (arr[i] != null) {
            for (HTObject item : arr[i]) {
                result += "[Key: " + item.key + ", Value: " + item.value + "], ";
            }
        }
    }
    result += "}";
    return result;
}
}
