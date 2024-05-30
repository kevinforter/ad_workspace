package ch.hslu.informatik.ad.einfuehrung.E0;

public interface Memory {

    Allocation malloc(int size);
    void free(Allocation allocation);
    int getAllocated();
    int getFree();
}
