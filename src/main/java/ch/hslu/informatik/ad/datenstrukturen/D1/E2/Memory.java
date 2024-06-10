package ch.hslu.informatik.ad.datenstrukturen.D1.E2;

public interface Memory {

    Allocation malloc(int size);
    void free(Allocation allocation);
    int getAllocated();
    int getFree();
}