package ch.hslu.informatik.ad.datenstrukturen.D3.E3.PHPfog;

public interface HashtabellePHPfog {
    int getSize();
    boolean isFull();
    void insert(Integer key, String value);
    void remove(Integer key);
    String search(Integer key);
}
