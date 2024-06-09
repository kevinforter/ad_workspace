package ch.hslu.informatik.ad.datenstrukturen.D1;

import java.util.ArrayList;
import java.util.List;

public class MemorySimple implements Memory {

    private int memorySize;
    private int allocated;

    private final List<Integer> allocations = new ArrayList<>();

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

        if (memorySize - block.getSize() < 0) {
            throw new IllegalArgumentException("Speicherplatz kann nicht kleiner als 0 sein");
        }
        memorySize += block.getSize();
        allocated -= block.getSize();

        for (int i = allocations.size() - 1; i >= allocated; i--) {
            allocations.remove(i);
        }

        block = null;
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
