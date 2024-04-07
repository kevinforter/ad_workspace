package ch.hslu.informatik.ad.datenstrukturen.D3.E4;

import ch.hslu.informatik.ad.datenstrukturen.D3.E1.PHPfog.HashtabellePHPfogImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;

public class HashTableBucketImpl implements HashTableBucket{

    private int size;
    private List<HtObj>[] arr;

    public class HtObj {
        public Integer key;
        public String value;
    }

    public HashTableBucketImpl(int size) {
        this.arr = (List<HtObj>[]) new List[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<HtObj>();
        }
        this.size = 0;
    }

    @Override
    public void insert(Integer key, String value) {
        int index = abs(key.hashCode() % arr.length);

        if (arr[index] == null) {
            arr[index] = new LinkedList<HtObj>();
        }

        HtObj obj = new HtObj();
        obj.key = key;
        obj.value = value;
        arr[index].add(obj);

        size++;
    }

    @Override
    public void remove(Integer key) {

    }

    @Override
    public String search(Integer key) {
        int index = abs(key.hashCode() % arr.length);

        if (arr[index] != null) {
            for (HtObj obj : arr[index]) {
                if (obj.key.equals(key)) {
                    return obj.value;
                }
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == arr.length;
    }
}
