package ch.hslu.informatik.ad.datenstrukturen.D3.E3.Geeks4Geeks;

public interface HashtabelleG4G {
    int getSize();
    boolean isFull();
    void insert(Integer key, String value);
    void remove(Integer key);
    String search(Integer key);
}