package ch.hslu.informatik.ad.datenstrukturen.D3.E4;

public interface HashTableBucket {

    void insert(Integer key, String value);
    void remove(Integer key);
    String search(Integer key);
    int size();
    boolean isFull();
}
