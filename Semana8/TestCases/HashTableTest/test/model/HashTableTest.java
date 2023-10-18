package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    private HashTable<Integer, Integer> hash;

    private void setupScenary1() {
        hash = new HashTable<Integer, Integer>();
    }

    private void setupScenary2(){

    }

    private void setupScenary3(){
        hash = new HashTable<Integer, Integer>();
        hash.put(1, 1);

    }

    private void setupScenary4() {
        hash = new HashTable<Integer, Integer>();
        hash.put(1, 1);
        hash.put(2, 2);
        hash.put(3, 3);
        hash.put(4, 4);
        hash.put(5, 5);
    }

    @Test
    public void emptyHashTest() {
        //setup test
        setupScenary1();

        //assert
        assertTrue(hash.isEmpty(), "The Hash is empty");
    }

    @Test
    public void hashNotEvenCreated(){
        //setup test
        setupScenary2();

        //assert
        assertNull(hash, "Fail creating a new hash table");
    }

    //positive
    @Test
    public void oneObject(){
        //setup test
        setupScenary3();

        //assert
        assertTrue(!hash.isEmpty(), "The Hash isn't empty, one object");

    }

    //negative
    @Test
    public void oneObject2(){
        //setup test
        setupScenary3();

        //assert
        assertFalse(hash.isEmpty(), "The Hash is not empty");
    }

    @Test
    public void putTest() {
        //setup test
        setupScenary4();

        //act
        hash.put(1, 1);
        hash.put(2, 2);
        hash.put(3, 3);
        hash.put(4, 4);
        hash.put(5, 5);

        //assert
        assertEquals(5, hash.getSize(), "The size is not correct");
    }

}
