package ch.hslu.informatik.ad.Datenstrukturen.D3.E3;

public interface HashtabelleKollisionSondierung {

    void insert(Integer key, String value);
    String search(Integer key);
    boolean remove(Integer key);
    int size();
    boolean isFull();

}
