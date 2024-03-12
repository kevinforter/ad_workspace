package ch.hslu.E0.E2;

public interface Memory {

    Allocation malloc(int size);
    void free(Allocation allocation);
    int getAllocated();
    int getFree();
}
