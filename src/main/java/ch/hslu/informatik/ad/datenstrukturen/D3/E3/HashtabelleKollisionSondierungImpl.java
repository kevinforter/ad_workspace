package ch.hslu.informatik.ad.datenstrukturen.D3.E3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static java.lang.Math.abs;
import static java.util.Objects.hash;

public class HashtabelleKollisionSondierungImpl implements HashtabelleKollisionSondierung {

    public static final Logger LOG = LoggerFactory.getLogger(HashtabelleKollisionSondierungImpl.class);

    private final String[] arr;
    private int size;
    private static final int TABLE_SIZE = 10;

    public HashtabelleKollisionSondierungImpl() {
        this.arr = new String[TABLE_SIZE];
        this.size = 0;
    }

    @Override
    public void insert(Integer key, String value) {
        // Komprimierung
        int index = abs(hash(key) % arr.length);
        // Einfügen
        if (arr[index] == null) {
            arr[index] = value;
            size++;
        } else {
            // Kollision behandeln
            int i = index;
            do {
                i = (i + 1) % arr.length; // Lineare Sondierung (Nächster freier Platz)
                if (arr[i] == null) {
                    arr[i] = value;
                    size++;
                    return;
                }
            } while (i != index); // Stopp wenn Ende von Array
        }
        if (size == arr.length) {
            LOG.error("Der Speicher ist voll");
        }
    }

    @Override
    public String search(Integer key) {
        final int index = abs(hash(key) % arr.length);
        return arr[index] != null ? arr[index] : null;
    }

    @Override
    public boolean remove(Integer key) {
        int index = abs(hash(key) % arr.length);
        if (arr[index] != null) {
            arr[index] = null;
            size--;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size() == TABLE_SIZE;
    }

    @Override
    public String toString() {
        return "HashtabelleImpl{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
