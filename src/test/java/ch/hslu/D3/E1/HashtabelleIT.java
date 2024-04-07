package ch.hslu.D3.E1;

import ch.hslu.informatik.ad.Datenstrukturen.D3.E1.Hashtabelle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashtabelleIT {

    private Hashtabelle ht;
    private Hashtabelle fht;

    @BeforeEach
    void setUp() {

        ht = Util.createHashTabelle();
        fht = Util.filledHashTabelle();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void insert() {

        ht.insert(1, "Element 1");
        ht.insert(2, "Element 2");
        ht.insert(3, "Element 3");

        assertEquals("Element 1", ht.search(1));
        assertEquals("Element 2", ht.search(2));
        assertEquals("Element 3", ht.search(3));
    }

    @Test
    void search() {

        assertEquals("Element 1", fht.search(1));
        assertEquals("Element 2", fht.search(2));
        assertEquals("Element 3", fht.search(3));
    }

    @Test
    void remove() {

        fht.remove(1);

        assertNull(fht.search(1));
        assertEquals("Element 2", fht.search(2));
        assertEquals("Element 3", fht.search(3));

    }
}