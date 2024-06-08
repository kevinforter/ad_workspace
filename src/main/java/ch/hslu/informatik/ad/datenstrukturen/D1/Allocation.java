package ch.hslu.informatik.ad.datenstrukturen.D1;

import java.util.Objects;

public class Allocation implements Comparable{

    private final int address;
    private final int allocationSize;

    public Allocation(int address, int size) {
        this.address = address;
        this.allocationSize = size;
    }

    public int getAddress() {
        return address;
    }

    public int getSize() {
        return allocationSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Allocation that)) return false;
        return getAddress() == that.getAddress() && getSize() == that.getSize();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(), getSize());
    }

    @Override
    public String toString() {
        return "Allocation [Address: " + address + ", Size: " + allocationSize + "]";
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Allocation)) {
            throw new IllegalArgumentException("Object must be an instance of Allocation");
        }
        Allocation other = (Allocation) o;
        int addressComparison = Integer.compare(this.address, other.address);
        if (addressComparison != 0) {
            return addressComparison;
        }
        return Integer.compare(this.allocationSize, other.allocationSize);
    }
}