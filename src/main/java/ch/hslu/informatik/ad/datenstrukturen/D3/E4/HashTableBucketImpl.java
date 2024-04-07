package ch.hslu.informatik.ad.datenstrukturen.D3.E4;

public class HashTableBucketImpl implements HashTableBucket{

    private int size;
    private final HtObj[] arr;

    public class HtObj {
        public Integer key;
        public String value;
    }

    public HashTableBucketImpl(int size) {
        this.arr = new HtObj[size];
        this.size = 0;
    }

    @Override
    public void insert(Integer Key, String Value) {

    }

    @Override
    public void remove(Integer Key) {

    }

    @Override
    public String search(Integer Key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
