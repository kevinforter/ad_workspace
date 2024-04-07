package ch.hslu.informatik.ad.datenstrukturen.D3.E4;

public interface HashTableBucket {

    void insert(Integer Key, String Value);
    void remove(Integer Key);
    String search(Integer Key);
    int size();
    boolean isFull();
}
