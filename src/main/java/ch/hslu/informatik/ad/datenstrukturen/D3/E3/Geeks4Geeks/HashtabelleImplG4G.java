// Credit: https://www.geeksforgeeks.org/java-program-to-implement-hashtables-with-linear-probing/
package ch.hslu.informatik.ad.datenstrukturen.D3.E3.Geeks4Geeks;

public class HashtabelleImpl {
    private int currentSize, maxSize;
    private Integer[] keys;
    private String[] value;

    // Constructor of this class
    public HashtabelleImpl(int capacity)
    {
        currentSize = 0;
        maxSize = capacity;
        keys = new Integer[maxSize];
        value = new String[maxSize];
    }

    // Function to get size of hash table
    public int getSize() { return currentSize; }

    // Function to check if hash table is full
    public boolean isFull()
    {
        return currentSize == maxSize;
    }

    // Function to get hash code of a given key
    private int hash(Integer key)
    {
        return key.hashCode() % maxSize;
    }

    // Function to insert key-value pair
    public void insert(Integer key, String val)
    {
        int tmp = hash(key);
        int i = tmp;

        // Do-while loop
        // Do part for performing actions
        do {
            if (keys[i] == null) {
                keys[i] = key;
                value[i] = val;
                currentSize++;
                return;
            }

            if (keys[i].equals(key)) {
                value[i] = val;
                return;
            }
            i = (i + 1) % maxSize; // Lineare Sondierung
        }

        // Do-while loop
        // while part for condition check
        while (i != tmp);
    }

    // Function to get value for a given key
    public String search(Integer key)
    {
        int i = hash(key);
        while (keys[i] != null) {
            if (keys[i].equals(key))
                return value[i];
            i = (i + 1) % maxSize;
        }
        return null;
    }

    // Function to remove key and its value
    public void remove(Integer key)
    {
        if (search(key) == null) return;

        // Find position key and delete
        int i = hash(key);
        while (!key.equals(keys[i]))
            i = (i + 1) % maxSize;
        keys[i] = null;
        value[i] = null;

        // rehash all keys
        for (i = (i + 1) % maxSize; keys[i] != null;
             i = (i + 1) % maxSize) {
            Integer tmp1 = keys[i];
            String tmp2 = value[i];
            keys[i] = null;
            value[i] = null;
            currentSize--;
            insert(tmp1, tmp2);
        }
        currentSize--;
    }
}