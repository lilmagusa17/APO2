package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    private HashTable<Integer, Integer> hash;

    private void setupScenary1() {
        hash = new HashTable<Integer, Integer>();
    }

    private void setupScenary2() {
        hash = new HashTable<Integer, Integer>();
        hash.put(1, 1);
        hash.put(2, 2);
        hash.put(3, 3);
        hash.put(4, 4);
        hash.put(5, 5);
    }

    @Test
    public void emptyHashTest() {
        setupScenary1();

        assertTrue(hash.isEmpty(), "The Hash is empty");
    }

    public void oneObject(){

    }

    @Test
    public void putTest() {
        setupScenary1();

        hash.put(1, 1);
        hash.put(2, 2);
        hash.put(3, 3);
        hash.put(4, 4);
        hash.put(5, 5);

        assertEquals(5, hash.getSize(), "The size is not correct");
    }

}