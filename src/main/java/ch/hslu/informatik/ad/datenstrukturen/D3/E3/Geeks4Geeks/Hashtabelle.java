package ch.hslu.informatik.ad.datenstrukturen.D3.E3.Geeks4Geeks;

public interface Hashtabelle {
    int getSize();
    boolean isFull();
    int hash(String key);
    void insert(Integer key, String value);
    void remove(Integer key);
    void search(Integer key);
}