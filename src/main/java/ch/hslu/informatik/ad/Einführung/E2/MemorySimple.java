package ch.hslu.informatik.ad.Einführung.E2;

import java.util.ArrayList;
import java.util.List;

public class MemorySimple implements Memory{

    private int memorySize;
    private int allocated;

    private List<Integer> allocations = new ArrayList<>();

    public MemorySimple(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public Allocation malloc(int blockSize) {

        if (blockSize > memorySize) {
            throw new IllegalArgumentException("Nicht genügend Speicherplatz");
        }
        memorySize -= blockSize;
        allocated += blockSize;

        Allocation allocation = new Allocation(allocations.size(), blockSize);

        for (int i = 0; i < blockSize; i++) {
            allocations.add(i);
        }
        return allocation;
    }

    @Override
    public void free(Allocation block) {
        memorySize += block.getSize();
        allocated -= block.getSize();
    }

    @Override
    public int getAllocated() {
        return allocated;
    }

    @Override
    public int getFree() {
        return memorySize;
    }

    @Override
    public String toString() {
        return "MemorySimple [Belegt: " + allocated + ", Frei: " + memorySize + "]";
    }
}
