package ch.hslu.informatik.ad.datenstrukturen.D1;

public interface Memory {

    Allocation malloc(int size);
    void free(Allocation allocation);
    int getAllocated();
    int getFree();
}
