// Credits: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
package ch.hslu.informatik.ad.datenstrukturen.D3.E4;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.abs;

public class HashTableBucketImpl implements HashTableBucket {

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
        int index = abs(key.hashCode() % arr.length);

        if (arr[index] != null) {
            for (HtObj obj : arr[index]) {
                if (obj.key.equals(key)) {
                    arr[index].remove(obj);
                    size--;
                    break;
                }
            }
        }
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nHashTableBucketImpl{\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                for (HtObj obj : arr[i]) {
                    sb.append("[Bucket: ").append(i).append(", Key: ").append(obj.key).append(", Value: ").append(obj.value).append("], ");
                }
                sb.append("\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
